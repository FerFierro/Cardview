package com.escom.tt2016.cardview.adaptadores;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.escom.tt2016.cardview.R;
import com.escom.tt2016.cardview.db.DBHelper;
import com.escom.tt2016.cardview.modelo.DataManager;
import com.escom.tt2016.cardview.modelo.MethodsManager;
import com.escom.tt2016.cardview.modelo.Nivel;
import java.util.List;
import java.util.Locale;
import static com.escom.tt2016.cardview.modelo.Nivel.VISTA_NORMAL;



public class IniciarNivel_main extends AppCompatActivity implements TextToSpeech.OnInitListener{

    private RecyclerView recycler_nivel;
    private NivelAdaptador adapter;
    private MethodsManager methodsManager=new MethodsManager();
    private TextToSpeech tts;
    private DBHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_iniciar_nivel);
        DataManager datos=new DataManager();
        tts = new TextToSpeech( this, this );
        datos.Init_Niveles(this);
        db=new DBHelper(this);


        recycler_nivel = (RecyclerView) findViewById(R.id.reciclador_iniciar_nivel);




        InitAdapter(recycler_nivel ,db.getAllNiveles());



    }


    public void InitAdapter(RecyclerView mRecyclerView,List<Nivel> items){

        assert mRecyclerView != null;
        adapter = new NivelAdaptador(items);
        setupRecyclerView(mRecyclerView,  adapter,VISTA_NORMAL);


    }



    private void setupRecyclerView(@NonNull RecyclerView recyclerView,NivelAdaptador items,int tipo) {
        recyclerView.setAdapter(items);
        if (tipo==0){recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        }else
            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        // recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.HORIZONTAL, false));
    }

    @Override
    public void onInit(int status) {
        if ( status == TextToSpeech.LANG_MISSING_DATA | status == TextToSpeech.LANG_NOT_SUPPORTED ) {
            Toast toast=Toast.makeText(IniciarNivel_main.this,"ola",Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    private void speak( String str ) {
        if (str==""){
            speak("Selecciona un pictograma para formar una oración");
        }else{
            tts.speak( str, TextToSpeech.QUEUE_FLUSH, null );
            tts.setSpeechRate( 0.0f );
            tts.setPitch( 0.0f );
        }

    }

    protected void onDestroy() {
        if ( tts != null ) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    /*********************************************************************************************************
     *
     *                           Inicia mi Adaptador CardViewadaptador
     *
     *********************************************************************************************************/
    public class NivelAdaptador  extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

        private List<Nivel> mValues;

        public NivelAdaptador(List<Nivel> items) {
            this.mValues = items;
        }


        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view;
            switch (viewType){

                case VISTA_NORMAL:
                    view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tipo_nivel, parent, false);
                    return new NivelViewHolder(view);

                /* case TIPO_PIC_SELECCIONADO:
                     view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view_frase, parent, false);
                     return new FraseViewHolder(view); */

            }
            return null;

        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            Nivel object= mValues.get(position);
            if (object != null) {
                switch (object.getTipo()) {

                    case VISTA_NORMAL:
                        ((NivelViewHolder) holder).mVTextViewNivel.setText(object.getNombre()+" "+object.getProgresso()+"%");
                        ((NivelViewHolder) holder).mVImageNivel.setImageResource(object.getIdDrawable());
                        ((NivelViewHolder) holder).mvProgressBarNivel.setProgress(object.getProgresso());

                        break;

                    /* case TIPO_PIC_SELECCIONADO:
                         ((FraseViewHolder) holder).mNombreViewFrase.setText(object.nombre);
                         ((FraseViewHolder) holder).mImageViewFrase.setImageResource(object.getIdDrawable());
                         ((FraseViewHolder) holder).cv.setCardBackgroundColor(getBackground_CardView(object.getCategoria()));

                         break; */
                }
            }


           // holder.mVTextView.setText(object.nombre);
            //holder.mVImage.setBackgroundResource(getBackground2(items.get(position).categoria));
            //holder.mVTextView.setTextColor(getBackground(items.get(position).categoria));

        }


        @Override
        public int getItemCount() {
            return mValues.size();
        }

        @Override
        public int getItemViewType(int position) {
            if (mValues != null) {
                final  Nivel object = mValues.get(position);
                if (object != null) {
                    return object.getTipo();
                }
            }
            return 0;
        }

        public  class NivelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
            private ImageButton mVImageNivel;
            private TextView mVTextViewNivel;
            private ProgressBar mvProgressBarNivel;


            public NivelViewHolder(View itemView) {
                super(itemView);
                mvProgressBarNivel=(ProgressBar) itemView.findViewById(R.id.progressbar_nivel);
                mVImageNivel=(ImageButton) itemView.findViewById(R.id.btn_nivel);
                mVTextViewNivel=(TextView) itemView.findViewById(R.id.tv_nombre_nivel);
                mVImageNivel.setOnClickListener(this);

            }

            @Override
            public void onClick(View v) {

                int posicision=getAdapterPosition();
                Nivel mNivel=mValues.get(posicision);
                Intent Vocales,Consonantes,Bisilabas,Trisilabas,Polisilabas;

                methodsManager.Init_Toast(v,null,mNivel);


                Locale locSpanish = new Locale("spa", "MEX");
                tts.setLanguage(locSpanish);
                speak(mNivel.getNombre());
                switch (mNivel.getNombre()){
                    case "Vocales":
                        Vocales=new Intent(IniciarNivel_main.this, Vocales_main.class);
                        startActivity(Vocales);
                        break;
                    case "Consonantes":
                        Toast.makeText(IniciarNivel_main.this, "Entrastes a la seccion Consonantes", Toast.LENGTH_SHORT).show();
                        break;
                    case "Bisilabas":
                        Toast.makeText(IniciarNivel_main.this, "Entrastes a la seccion Consonantes", Toast.LENGTH_SHORT).show();

                        break;
                    case "Trisilabas":
                        Toast.makeText(IniciarNivel_main.this, "Entrastes a la seccion Consonantes", Toast.LENGTH_SHORT).show();

                        break;
                    case "Polisilabas":
                        Toast.makeText(IniciarNivel_main.this, "Entrastes a la seccion Consonantes", Toast.LENGTH_SHORT).show();

                        break;
                }

            }

        }//fin CardVieHolder



               @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }


    }




}

