package com.es.api.pokedex.dto;

public class TipoDTO {
    private String nombre;

    public TipoDTO(String nombre) {
        this.nombre = nombre;
    }

    public TipoDTO(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

