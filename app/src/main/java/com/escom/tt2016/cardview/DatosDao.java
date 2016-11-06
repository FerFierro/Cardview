package com.escom.tt2016.cardview;

import com.escom.tt2016.cardview.modelo.Pictograma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Angel on 05/11/2016.
 */

public class DatosDao {

    List<Pictograma> PIC_SELECCIONADO=new ArrayList<Pictograma>();

    public void guardar(int id,int tipo,int categoria,String nombre,int idDrawable){
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
}
