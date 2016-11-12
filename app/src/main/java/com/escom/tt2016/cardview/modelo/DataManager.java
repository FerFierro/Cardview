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
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Comer", R.drawable.ic_pic_verbos_comer));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Comprar",R.drawable.ic_pic_verbos_comprar));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Escribir",R.drawable.ic_pic_verbos_escribir));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Estudiar",R.drawable.ic_pic_verbos_estudiar));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Jugar",R.drawable.ic_pic_verbos_jugar));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Leer",R.drawable.ic_pic_verbos_leer));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Nadar",R.drawable.ic_pic_verbos_nadar));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Saltar",R.drawable.ic_pic_verbos_saltar));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_VERBOS,"Viajar",R.drawable.ic_pic_verbos_viajar));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Coca",R.drawable.ic_pic_alimentos_coke));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Dona",R.drawable.ic_pic_alimentos_dona));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Hamburguesa",R.drawable.ic_pic_alimentos_hamburger));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Hot dog",R.drawable.ic_pic_alimentos_hotdog));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Huevo",R.drawable.ic_pic_alimentos_huevo));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Langosta",R.drawable.ic_pic_alimentos_langosta));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Leche",R.drawable.ic_pic_alimentos_leche));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Paleta de hielo",R.drawable.ic_pic_alimentos_paletadehielo));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ALIMENTOS,"Palomitas",R.drawable.ic_pic_alimentos_palomitas));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_ALIMENTOS,"Sushi",R.drawable.ic_pic_alimentos_sushi));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Hermana",R.drawable.ic_pic_familia_hermana));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Hermano",R.drawable.ic_pic_familia_hermano));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Prima",R.drawable.ic_pic_familia_prima));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Primo",R.drawable.ic_pic_familia_primo));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_FAMILIA,"Vaca",R.drawable.ic_pic_animales_vaca));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Astronauta",R.drawable.ic_pic_profesiones_astronauta));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Capitán",R.drawable.ic_pic_profesiones_capitan));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Detective",R.drawable.ic_pic_profesiones_detective));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Doctor",R.drawable.ic_pic_profesiones_doctor));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Enfermera",R.drawable.ic_pic_profesiones_enfermera));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Granjero",R.drawable.ic_pic_profesiones_granjero));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Ingeniero",R.drawable.ic_pic_profesiones_ingeniero));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Maestra",R.drawable.ic_pic_profesiones_maestra));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES,"Mesera",R.drawable.ic_pic_profesiones_mesera));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_PROFESIONES,"Piloto",R.drawable.ic_pic_profesiones_piloto));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_PROFESIONES,"Soldado",R.drawable.ic_pic_profesiones_soldado));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Aeropuerto",R.drawable.ic_pic_lugares_aeropuerto));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Banco",R.drawable.ic_pic_lugares_banco));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Casa",R.drawable.ic_pic_lugares_casa));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Circo",R.drawable.ic_pic_lugares_circo));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Ciudad",R.drawable.ic_pic_lugares_ciudad));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Clínica",R.drawable.ic_pic_lugares_clinica));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Disneylandia",R.drawable.ic_pic_lugares_disney_landia));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Estación de policía",R.drawable.ic_pic_lugares_estacion_policia));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Fábrica",R.drawable.ic_pic_lugares_fabrica));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Farmacia",R.drawable.ic_pic_lugares_farmacia));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Gasolinera",R.drawable.ic_pic_lugares_gasolineria));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Hospital",R.drawable.ic_pic_lugares_hospital));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Hotel",R.drawable.ic_pic_lugares_hotel));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Iglesia",R.drawable.ic_pic_lugares_iglesia));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Montaña",R.drawable.ic_pic_lugares_montanas));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Museo",R.drawable.ic_pic_lugares_museo));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Parque",R.drawable.ic_pic_lugares_parque));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Pizzería",R.drawable.ic_pic_lugares_pizzeria));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Tienda",R.drawable.ic_pic_lugares_tienda));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_LUGARES,"Veterinaria",R.drawable.ic_pic_lugares_veterinaria));


            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Águila",R.drawable.ic_pic_animales_aguila));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Borrego cimarrón",R.drawable.ic_pic_animales_borrego_cimarron));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Buho",R.drawable.ic_pic_animales_buho));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Camaleón",R.drawable.ic_pic_animales_camaleon));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Conejo",R.drawable.ic_pic_animales_conejo));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Jirafa",R.drawable.ic_pic_animales_jirafa));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Libélula",R.drawable.ic_pic_animales_libelula));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Loro",R.drawable.ic_pic_animales_loro));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL, CAT_ANIMALES,"Mapache",R.drawable.ic_pic_animales_mapache));
            dbHandler.addUser(new Pictograma(TIPO_PIC_NORMAL,CAT_ANIMALES,"Vaca",R.drawable.ic_pic_animales_vaca));

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

}


