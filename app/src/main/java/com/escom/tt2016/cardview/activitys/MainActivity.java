package com.escom.tt2016.cardview.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.escom.tt2016.cardview.R;
import com.escom.tt2016.cardview.adaptadores.Comunicador_main;
import com.escom.tt2016.cardview.adaptadores.IniciarNivel_main;

public class MainActivity extends AppCompatActivity {
    private ImageView Iniciar_nivel,Iniciar_comunicador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iniciar_nivel=(ImageView) findViewById(R.id.iv_main_iniciar_nivel);
        Iniciar_comunicador=(ImageView) findViewById(R.id.iv_main_iniciar_comunicador);

        Iniciar_nivel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, IniciarNivel_main.class);
                startActivity(i);
            }
        });

        Iniciar_comunicador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, Comunicador_main.class);
                startActivity(i);
            }
        });


    }


}
