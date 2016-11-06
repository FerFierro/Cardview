package com.escom.tt2016.cardview.modelo;

import com.escom.tt2016.cardview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 03/11/2016.
 */



public class Pictograma {
    public static final int TIPO_PIC_NORMAL=0;
    public static final  int TIPO_PIC_SELECCIONADO=1;
    public static final int CAT_VERBOS =1;
    public static final int CAT_ALIMENTOS =2;
    public static final int CAT_FAMILIA =3;
    public static final int CAT_PROFESIONES =4;
    public static final int CAT_LUGARES =5;
    public static final int CAT_ANIMALES =6;
    public static final int CAT_OTRO =7;

    private int id;
    private int tipo;
    public int categoria;
    public String nombre;
    public int idDrawable;

    public Pictograma(int tipo, int categoria, String nombre, int idDrawable) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public String toString() {
        return ("Nombre: "     +nombre+"\n" +
                "Categoria: "  +categoria+"\n"+
                "IdDrawable: " +idDrawable+"\n");
    }
}


