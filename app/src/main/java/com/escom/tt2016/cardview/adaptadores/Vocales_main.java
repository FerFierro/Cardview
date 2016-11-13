package com.escom.tt2016.cardview.adaptadores;

import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.escom.tt2016.cardview.R;
import com.escom.tt2016.cardview.db.DBHelper;
import com.escom.tt2016.cardview.modelo.DataManager;
import com.escom.tt2016.cardview.modelo.Pictograma;

import java.util.List;

import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_VERBOS;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_VOCALES;
import static com.escom.tt2016.cardview.modelo.Pictograma.TIPO_PIC_NORMAL;

public class Vocales_main extends AppCompatActivity {

    MediaPlayer mPlayer;
    private boolean fabStateVolume = false;
    VocalesAdaptador adapter;
    private DBHelper db;
    private RecyclerView recycler_ejercicios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ejercicio_preetablecido);
        DataManager datos=new DataManager();
        datos.Init_Contenido_niveles(this);
        db=new DBHelper(this);

        recycler_ejercicios =          (RecyclerView) findViewById(R.id.reciclador_nivel_vocales);
        InitAdapter(recycler_ejercicios ,db.getCategoria(CAT_VOCALES));


    }

    public void InitAdapter(RecyclerView mRecyclerView,List<Pictograma> items){
        System.out.println("Entre a InitAdapter");

        assert mRecyclerView != null;
        adapter = new VocalesAdaptador(items);
        System.out.println(items.get(4));

        setupRecyclerView(mRecyclerView,  adapter);


    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView, VocalesAdaptador items) {
        System.out.println("Entre a setupRecyclerView");

        recyclerView.setAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        // recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.HORIZONTAL, false));
    }

    public class VocalesAdaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        private List<Pictograma> mValues;


        public VocalesAdaptador(List<Pictograma> mValues) {
            this.mValues = mValues;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view;
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view_ejercicio_preestablecido, parent, false);
            return new VocalesViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
            final Pictograma object=mValues.get(position);
            System.out.println(object.getNombre());

            ((VocalesViewHolder) holder).mVTextVocal.setText(object.getNombre());
            ((VocalesViewHolder) holder).mfab1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if (fabStateVolume) {
                         if (mPlayer.isPlaying()) {
                             mPlayer.stop();

                         }
                         ((VocalesViewHolder) holder).mfab1.setImageResource(R.drawable.ic_play);
                         fabStateVolume = false;

                     } else {
                         mPlayer = MediaPlayer.create(Vocales_main.this,object.getIdSonido());
                         mPlayer.setLooping(true);
                         mPlayer.start();
                         ((VocalesViewHolder) holder).mfab1.setImageResource(R.drawable.ic_toast_megaphone_2);
                         fabStateVolume = true;

                     }
                 }
             });

             ((VocalesViewHolder) holder).mfab2.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if (fabStateVolume) {
                         if (mPlayer.isPlaying()) {
                             mPlayer.stop();

                         }
                         ((VocalesViewHolder) holder).mfab2.setImageResource(R.drawable.ic_play);
                         fabStateVolume = false;

                     } else {
                         mPlayer = MediaPlayer.create(Vocales_main.this,object.getIdSonido2());
                         mPlayer.setLooping(true);
                         mPlayer.start();
                         ((VocalesViewHolder) holder).mfab2.setImageResource(R.drawable.ic_toast_megaphone_2);
                         fabStateVolume = true;

                     }
                 }
             });


             ((VocalesViewHolder) holder).mfab3.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     if (fabStateVolume) {
                         if (mPlayer.isPlaying()) {
                             mPlayer.stop();

                         }
                         ((VocalesViewHolder) holder).mfab3.setImageResource(R.drawable.ic_play);
                         fabStateVolume = false;

                     } else {
                         mPlayer = MediaPlayer.create(Vocales_main.this,object.getIdSonido3());
                         mPlayer.setLooping(true);
                         mPlayer.start();
                         ((VocalesViewHolder) holder).mfab3.setImageResource(R.drawable.ic_toast_megaphone_2);
                         fabStateVolume = true;

                     }
                 }
             });



        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        public class VocalesViewHolder extends RecyclerView.ViewHolder{
            private TextView mVTextVocal;
            public  FloatingActionButton mfab1,mfab2,mfab3;

            public VocalesViewHolder(View itemView) {
                super(itemView);

                mVTextVocal=(TextView) itemView.findViewById(R.id.tv_card_ejercicio_preestablecido);
                mfab1=(FloatingActionButton) itemView.findViewById(R.id.fab);
                mfab2=(FloatingActionButton) itemView.findViewById(R.id.fab2);
                mfab3=(FloatingActionButton) itemView.findViewById(R.id.fab3);
            }
        }
    }
}
