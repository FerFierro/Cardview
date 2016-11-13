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
    public static final int CAT_VOCALES=7;
    public static final int CAT_BISILABAS=8;
    public static final int CAT_TRISILABAS=9;
    public static final int CAT_POLISILABAS=10;

    private int id;
    private int tipo;
    public int categoria;
    public String nombre;
    public int idDrawable;
    public int idSonido,idSonido2,idSonido3;

    public Pictograma(int tipo, int categoria, String nombre, int idDrawable,int idSonido,int idSonido2,int idSonido3) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
        this.idSonido = idSonido;
        this.idSonido2 = idSonido2;
        this.idSonido3 = idSonido3;
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

    public int getIdSonido() {
        return idSonido;
    }

    public void setIdSonido(int idSonido) {
        this.idSonido = idSonido;
    }

    public int getIdSonido2() {
        return idSonido2;
    }

    public void setIdSonido2(int idSonido2) {
        this.idSonido2 = idSonido2;
    }

    public int getIdSonido3() {
        return idSonido3;
    }

    public void setIdSonido3(int idSonido3) {
        this.idSonido3 = idSonido3;
    }

    public String toString() {
        return ("Nombre: "     +nombre+"\n" +
                "Categoria: "  +categoria+"\n"+
                "IdDrawable: " +idDrawable+"\n");
    }
}


