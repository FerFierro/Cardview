package com.escom.tt2016.cardview.adaptadores;


import android.app.Activity;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.escom.tt2016.cardview.DatosDao;
import com.escom.tt2016.cardview.MainActivity;
import com.escom.tt2016.cardview.MainActivity.*;
import com.escom.tt2016.cardview.R;
import com.escom.tt2016.cardview.modelo.Pictograma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import static com.escom.tt2016.cardview.utilidades.Utilidades.*;
import static com.escom.tt2016.cardview.modelo.Pictograma.TIPO_PIC_SELECCIONADO;


/**
 * Created by Angel on 03/11/2016.
 */

public class CardViewAdaptador  extends RecyclerView.Adapter<CardViewAdaptador.CardViewHolder>  {

    private List<Pictograma> mValues;
    List<Pictograma> PIC_SELECCIONADO=new ArrayList<Pictograma>();

    public CardViewAdaptador(List<Pictograma> items) {
        this.mValues = items;
    }


    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view_1, parent, false);
        CardViewHolder cvh=new CardViewHolder(v);
        return cvh;

    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        Pictograma mitem =mValues.get(position);
        holder.mVImage.setImageResource(mitem.idDrawable);
        holder.mVTextView.setText(mitem.nombre);
        //holder.mVImage.setBackgroundResource(getBackground2(items.get(position).categoria));
        //holder.mVTextView.setTextColor(getBackground(items.get(position).categoria));
        holder.cv.setCardBackgroundColor(getBackground(mitem.getCategoria()));

    }


    @Override
    public int getItemCount() {
        return mValues.size();
    }


    public  class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,TextToSpeech.OnInitListener{
        private ImageView mVImage;
        private TextView mVTextView;
        private CardView cv;
        private TextToSpeech tts;

        public CardViewHolder(View itemView) {
            super(itemView);
            cv=(CardView) itemView.findViewById(R.id.cv_pictograma);
            mVImage=(ImageView) itemView.findViewById(R.id.iv_card);
            mVTextView=(TextView) itemView.findViewById(R.id.tv_nombre);
            itemView.setOnClickListener(this);
            tts = new TextToSpeech( itemView.getContext(), this );
        }
        List<Pictograma> PIC_GUARDADOS= new ArrayList<Pictograma> ();
        @Override
        public void onClick(View v) {

             int pos=getAdapterPosition();
             Pictograma mPictograma=mValues.get(pos);
             Toast mToast=new Toast(v.getContext());
             DatosDao datosDao=new DatosDao();


             LayoutInflater layout_inflater=LayoutInflater.from(v.getContext());
             View custom_toast=layout_inflater.inflate(R.layout.toast,(ViewGroup) v.findViewById(R.id.linearlayout_toast) );
             TextView textToast = (TextView) custom_toast.findViewById(R.id.tv_card_toast);
             ImageView imageToast=(ImageView) custom_toast.findViewById(R.id.iv_pic_select_toast);

             custom_toast.setBackgroundResource(getBackground2(mPictograma.getCategoria()));
             textToast.setText(mPictograma.getNombre());//seteo el nombre
             imageToast.setImageResource(mPictograma.getIdDrawable());
             mToast.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);//seteo la ubucacion
             mToast.setDuration(Toast.LENGTH_SHORT);//seteo su duracion que se mostrara
             mToast.setView(custom_toast);
             mToast.show();

             Locale locSpanish = new Locale("spa", "MEX");
             tts.setLanguage(locSpanish);
             speak(mPictograma.getNombre());

             guardar(TIPO_PIC_SELECCIONADO,mPictograma.getCategoria(),mPictograma.nombre,mPictograma.getIdDrawable());
             //datosDao.mostrarDatosSeleccionados();//este metodo sirve de prueba para verificar que al seleccionar un pictograma se guerde en un Lis<>

        }

        @Override
        public void onInit(int status) {
            if ( status == TextToSpeech.LANG_MISSING_DATA | status == TextToSpeech.LANG_NOT_SUPPORTED ) {
                    Toast toast=Toast.makeText(itemView.getContext(),"ola",Toast.LENGTH_SHORT);
                    toast.show();
                }
        }

        private void speak( String str ) {
                tts.speak( str, TextToSpeech.QUEUE_FLUSH, null );
                tts.setSpeechRate( 0.0f );
                tts.setPitch( 0.0f );
        }

        protected void onDestroy() {
            if ( tts != null ) {
                tts.stop();
                tts.shutdown();
            }
            //super.onDestroy();
        }

    }//fin CardVieHolder


    public void guardar(int tipo,int categoria,String nombre,int idDrawable){
        Pictograma new_pictograma=new Pictograma(tipo,categoria,nombre,idDrawable);
        PIC_SELECCIONADO.add(new_pictograma);
        mostrarDatosSeleccionados(PIC_SELECCIONADO);

    }

    public  void mostrarDatosSeleccionados(List<Pictograma> items){
        Iterator m=items.iterator();
        System.out.println("*************************************");
        System.out.println("El arreglo contiene: "+items.size()+" elementos");
        while (m.hasNext())
            System.out.println("\n"+m.next());
        System.out.println("*************************************");
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
