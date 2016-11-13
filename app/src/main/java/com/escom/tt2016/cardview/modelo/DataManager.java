package com.escom.tt2016.cardview.modelo;

import android.content.Context;

import com.escom.tt2016.cardview.R;
import com.escom.tt2016.cardview.db.DBHelper;
import com.escom.tt2016.cardview.modelo.Pictograma;
import static com.escom.tt2016.cardview.modelo.Pictograma.TIPO_PIC_NORMAL;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_ALIMENTOS;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_ANIMALES;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_FAMILIA;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_LUGARES;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_PROFESIONES;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_VERBOS;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_VOCALES;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_BISILABAS;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_TRISILABAS;
import static com.escom.tt2016.cardview.modelo.Pictograma.CAT_POLISILABAS;

import static com.escom.tt2016.cardview.modelo.Nivel.VISTA_NORMAL;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 03/11/2016.
 */

public class DataManager {


    public  void Init_pictogramas(Context cn){

            DBHelper dbHandler=new DBHelper(cn);
            System.out.println("*******************************************************************************");
            System.out.println("Entre a Init_pictogramas");
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Comer", R.drawable.ic_pic_verbos_comer,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Comprar",R.drawable.ic_pic_verbos_comprar,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Escribir",R.drawable.ic_pic_verbos_escribir,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Estudiar",R.drawable.ic_pic_verbos_estudiar,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Jugar",R.drawable.ic_pic_verbos_jugar,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Leer",R.drawable.ic_pic_verbos_leer,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Nadar",R.drawable.ic_pic_verbos_nadar,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Saltar",R.drawable.ic_pic_verbos_saltar,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Viajar",R.drawable.ic_pic_verbos_viajar,0,0,0));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Coca",R.drawable.ic_pic_alimentos_coke,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Dona",R.drawable.ic_pic_alimentos_dona,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Hamburguesa",R.drawable.ic_pic_alimentos_hamburger,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Hot dog",R.drawable.ic_pic_alimentos_hotdog,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Huevo",R.drawable.ic_pic_alimentos_huevo,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Langosta",R.drawable.ic_pic_alimentos_langosta,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Leche",R.drawable.ic_pic_alimentos_leche,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Paleta de hielo",R.drawable.ic_pic_alimentos_paletadehielo,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Palomitas",R.drawable.ic_pic_alimentos_palomitas,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_ALIMENTOS,"Sushi",R.drawable.ic_pic_alimentos_sushi,0,0,0));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Hermana",R.drawable.ic_pic_familia_hermana,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Hermano",R.drawable.ic_pic_familia_hermano,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Prima",R.drawable.ic_pic_familia_prima,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Primo",R.drawable.ic_pic_familia_primo,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Vaca",R.drawable.ic_pic_animales_vaca,0,0,0));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Astronauta",R.drawable.ic_pic_profesiones_astronauta,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Capitán",R.drawable.ic_pic_profesiones_capitan,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Detective",R.drawable.ic_pic_profesiones_detective,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Doctor",R.drawable.ic_pic_profesiones_doctor,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Enfermera",R.drawable.ic_pic_profesiones_enfermera,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Granjero",R.drawable.ic_pic_profesiones_granjero,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Ingeniero",R.drawable.ic_pic_profesiones_ingeniero,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Maestra",R.drawable.ic_pic_profesiones_maestra,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Mesera",R.drawable.ic_pic_profesiones_mesera,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_PROFESIONES,"Piloto",R.drawable.ic_pic_profesiones_piloto,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_PROFESIONES,"Soldado",R.drawable.ic_pic_profesiones_soldado,0,0,0));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Aeropuerto",R.drawable.ic_pic_lugares_aeropuerto,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Banco",R.drawable.ic_pic_lugares_banco,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Casa",R.drawable.ic_pic_lugares_casa,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Circo",R.drawable.ic_pic_lugares_circo,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Ciudad",R.drawable.ic_pic_lugares_ciudad,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Clínica",R.drawable.ic_pic_lugares_clinica,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Disneylandia",R.drawable.ic_pic_lugares_disney_landia,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Estación de policía",R.drawable.ic_pic_lugares_estacion_policia,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Fábrica",R.drawable.ic_pic_lugares_fabrica,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Farmacia",R.drawable.ic_pic_lugares_farmacia,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Gasolinera",R.drawable.ic_pic_lugares_gasolineria,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Hospital",R.drawable.ic_pic_lugares_hospital,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Hotel",R.drawable.ic_pic_lugares_hotel,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Iglesia",R.drawable.ic_pic_lugares_iglesia,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Montaña",R.drawable.ic_pic_lugares_montanas,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Museo",R.drawable.ic_pic_lugares_museo,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Parque",R.drawable.ic_pic_lugares_parque,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Pizzería",R.drawable.ic_pic_lugares_pizzeria,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Tienda",R.drawable.ic_pic_lugares_tienda,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Veterinaria",R.drawable.ic_pic_lugares_veterinaria,0,0,0));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Águila",R.drawable.ic_pic_animales_aguila,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Borrego cimarrón",R.drawable.ic_pic_animales_borrego_cimarron,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Buho",R.drawable.ic_pic_animales_buho,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Camaleón",R.drawable.ic_pic_animales_camaleon,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Conejo",R.drawable.ic_pic_animales_conejo,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Jirafa",R.drawable.ic_pic_animales_jirafa,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Libélula",R.drawable.ic_pic_animales_libelula,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Loro",R.drawable.ic_pic_animales_loro,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Mapache",R.drawable.ic_pic_animales_mapache,0,0,0));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_ANIMALES,"Vaca",R.drawable.ic_pic_animales_vaca,0,0,0));

            System.out.println("Se cargaron todos los datos en la bd");

        }

        public void Init_Niveles(Context cn){

                DBHelper dbHandler=new DBHelper(cn);
                System.out.println("*******************************************************************************");
                System.out.println("Entre a Init_Niveles");

                dbHandler.addNivel(new Nivel(VISTA_NORMAL,    "Vocales",90,R.drawable.ic_android_muestra));
                dbHandler.addNivel(new Nivel(VISTA_NORMAL,"Consonantes",50,R.drawable.ic_android_muestra));
                dbHandler.addNivel(new Nivel(VISTA_NORMAL,  "Bisilabas",100,R.drawable.ic_android_muestra));
                dbHandler.addNivel(new Nivel(VISTA_NORMAL, "Trisilabas",25,R.drawable.ic_android_muestra));
                dbHandler.addNivel(new Nivel(VISTA_NORMAL,"Polisilabas",60,R.drawable.ic_android_muestra));

                System.out.println("Se cargaron todos los datos en la bd");

        }



        public void Init_Contenido_niveles(Context cn){

                DBHelper dbHandler=new DBHelper(cn);
                System.out.println("*******************************************************************************");
                System.out.println("Init_Contenido_niveles");

                dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VOCALES,"Aa",1,R.raw.a,R.raw.aprendevovala,R.raw.cancionvocales));
                dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VOCALES,"Ee",1,R.raw.e,R.raw.aprendevovala,R.raw.cancionvocales));
                dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VOCALES,"Ii",1,R.raw.i,R.raw.aprendevovala,R.raw.cancionvocales));
                dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VOCALES,"Oo",1,R.raw.o,R.raw.aprendevovala,R.raw.cancionvocales));
                dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VOCALES,"Uu",1,R.raw.u,R.raw.aprendevovala,R.raw.cancionvocales));
                System.out.println("Se cargaron todos los datos en la bd");
        }

}


