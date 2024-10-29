package com.es.api.pokedex.dto;

public class AtaqueDTO {

    private String nombre;
    private int danioBase;
    private Boolean isEspecial;
    private TipoDTO tipo;

    public AtaqueDTO(String nombre, int danioBase, Boolean isEspecial, TipoDTO tipo) {
        this.nombre = nombre;
        this.danioBase = danioBase;
        this.isEspecial = isEspecial;
        this.tipo = tipo;
    }

    public AtaqueDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDanioBase() {
        return danioBase;
    }

    public void setDanioBase(int danioBase) {
        this.danioBase = danioBase;
    }

    public Boolean getEspecial() {
        return isEspecial;
    }

    public void setEspecial(Boolean especial) {
        isEspecial = especial;
    }

    public TipoDTO getTipo() {
        return tipo;
    }

    public void setTipo(TipoDTO tipo) {
        this.tipo = tipo;
    }
}
