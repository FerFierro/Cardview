package com.escom.tt2016.cardview.modelo;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.escom.tt2016.cardview.R;
import com.escom.tt2016.cardview.modelo.Pictograma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.escom.tt2016.cardview.utilidades.Utilidades.getBackground;

/**
 * Created by Angel on 05/11/2016.
 */

public class MethodsManager {

    public List<Pictograma> Guardar(int tipo,int categoria,String nombre,int idDrawable,List<Pictograma> PIC_GUARDADO){
        Pictograma new_pictograma=new Pictograma(tipo,categoria,nombre,idDrawable,0,0,0);
        PIC_GUARDADO.add(new_pictograma);
        MostrarDatosSeleccionados(PIC_GUARDADO);
        return PIC_GUARDADO;

    }

    public  void MostrarDatosSeleccionados(List<Pictograma> items){
        Iterator m=items.iterator();
        System.out.println("*-----------------------------------*");
        System.out.println("*         Datos del Arreglo         *");
        System.out.println("*-----------------------------------*");

        System.out.println("El arreglo contiene: "+items.size()+" elementos");
        while (m.hasNext())
            System.out.println("\n"+m.next());

        System.out.println("*-----------------------------------*");
        System.out.println("*-----------------------------------*");
    }


    public List<Pictograma> Delete_Picto_Seleccionado(int index,List<Pictograma> PIC_GUARDADO){
        PIC_GUARDADO.remove(index);
        System.out.println("*delete.delete.delete.delete.delete.dlete*");
        System.out.println("*  Se borro el pictograma seleccionado   *");
        System.out.println("*----------------------------------------*");
        MostrarDatosSeleccionados(PIC_GUARDADO);
        return PIC_GUARDADO ;
    }




    public List<Pictograma> DeleteAll(List<Pictograma> PIC_GUARDADO,Context contexto){

        PIC_GUARDADO.clear();
        Toast.makeText(contexto, "Contenido eliminado", Toast.LENGTH_SHORT).show();
        MostrarDatosSeleccionados(PIC_GUARDADO);

        return PIC_GUARDADO;

    }


    public String Reproducir_Frase(List<Pictograma> items){
        String frase="";

        for(int i=0; i<items.size(); i++){
            frase += items.get(i).getNombre()+ " ";
        }
        return frase;
    }


    public void Init_Toast(View v, Pictograma mPictograma,Nivel mNivel){
        Toast mToast=new Toast(v.getContext());


        LayoutInflater layout_inflater=LayoutInflater.from(v.getContext());
        View custom_toast=layout_inflater.inflate(R.layout.toast,(ViewGroup) v.findViewById(R.id.linearlayout_toast) );
        TextView textToast = (TextView) custom_toast.findViewById(R.id.tv_card_toast);
        ImageView imageToast=(ImageView) custom_toast.findViewById(R.id.iv_pic_select_toast);

        if (mPictograma instanceof Pictograma){
            custom_toast.setBackgroundResource(getBackground(mPictograma.getCategoria()));
            textToast.setText(mPictograma.getNombre());//seteo el nombre
            imageToast.setImageResource(mPictograma.getIdDrawable());
        }else{
            textToast.setText(mNivel.getNombre());//seteo el nombre
            imageToast.setImageResource(mNivel.getIdDrawable());
        }

        mToast.setGravity(Gravity.TOP | Gravity.RIGHT, 0, 0);//seteo la ubucacion
        mToast.setDuration(Toast.LENGTH_SHORT);//seteo su duracion que se mostrara
        mToast.setView(custom_toast);
        mToast.show();
    }



}
