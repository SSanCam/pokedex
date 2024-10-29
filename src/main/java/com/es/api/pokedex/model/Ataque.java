package com.es.api.pokedex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ataques")
public class Ataque {

    @Column(nullable = false)
    private int danioBase;
    @Column(nullable = false)
    private Boolean isEspecial;

    @OneToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_pokemon")
    private Pokemon pokemon;

    @Id
    @JoinColumn(name = "id_pokemon")
    private String nombre;

    public Ataque(int danioBase, Boolean isEspecial, Tipo tipo, String nombre) {
        this.danioBase = danioBase;
        this.isEspecial = isEspecial;
        this.tipo = tipo;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
