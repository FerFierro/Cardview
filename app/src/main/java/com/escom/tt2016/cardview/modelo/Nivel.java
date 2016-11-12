package com.escom.tt2016.cardview.modelo;

/**
 * Created by Angel on 11/11/2016.
 */

public class Nivel {

    public static final int VISTA_NORMAL=0;

    private int id;
    private int tipo;
    private String nombre;
    private int progresso;
    private int idDrawable;

    public Nivel(int tipo, String nombre, int progresso, int idDrawable) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.progresso = progresso;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgresso() {
        return progresso;
    }

    public void setProgresso(int progresso) {
        this.progresso = progresso;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

}
