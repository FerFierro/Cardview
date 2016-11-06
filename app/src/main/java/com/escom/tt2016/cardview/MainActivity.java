package com.escom.tt2016.cardview;

import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.escom.tt2016.cardview.adaptadores.CardViewAdaptador;
import com.escom.tt2016.cardview.db.DBHelper;
import com.escom.tt2016.cardview.modelo.Pictograma;


import java.util.ArrayList;
import java.util.List;

import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_ALIMENTOS;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_ANIMALES;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_FAMILIA;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_LUGARES;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_PROFESIONES;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_VERBOS;
import static com.escom.tt2016.cardview.modelo.Pictograma.TIPO_PIC_NORMAL;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler,recycler2,recycler3,recycler4,recycler5,recycler6;
    private CardViewAdaptador adapter;
    private DBHelper db;




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatosManager datos=new DatosManager();
        datos.Init_pictogramas(this);
        db=new DBHelper(this);
       // List<Pictograma> verbos=;


        recycler = (RecyclerView) findViewById(R.id.reciclador_card);
        recycler2=(RecyclerView) findViewById(R.id.reciclador_card_2);
        recycler3=(RecyclerView) findViewById(R.id.reciclador_card_3);
        recycler4=(RecyclerView) findViewById(R.id.reciclador_card_4);
        recycler5=(RecyclerView) findViewById(R.id.reciclador_card_5);
        recycler6=(RecyclerView) findViewById(R.id.reciclador_card_6);



         InitAdapter(recycler ,db.getCategoria(CAT_VERBOS));
         InitAdapter(recycler2,db.getCategoria(CAT_ALIMENTOS));
         InitAdapter(recycler3,db.getCategoria(CAT_FAMILIA));
         InitAdapter(recycler4,db.getCategoria(CAT_PROFESIONES));
         InitAdapter(recycler5,db.getCategoria(CAT_LUGARES));
         InitAdapter(recycler6,db.getCategoria(CAT_ANIMALES));


    }


    public void InitAdapter(RecyclerView mRecyclerView,List<Pictograma> items){

        assert mRecyclerView != null;
        adapter = new CardViewAdaptador(items);
        setupRecyclerView(mRecyclerView,  adapter);


    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView,CardViewAdaptador items) {
        System.out.println("entro");
        recyclerView.setAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        // recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager( new GridLayoutManager(this, 3,GridLayoutManager.HORIZONTAL, false));
    }

}
