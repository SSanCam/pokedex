package com.es.api.pokedex.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private int vida;

    // Generar aleatoriamente si es o no shiny
    private Boolean isShiny;

    @OneToOne(optional = false)
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ataque> ataques;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Pokemon(String nombre, int vida, Boolean isShiny, Tipo tipo, List<Ataque> ataques) {
        this.nombre = nombre;
        this.vida = vida;
        this.isShiny = isShiny;
        this.tipo = tipo;
        this.ataques = ataques;
    }

    public Pokemon(String nombre, int vida, Boolean isShiny, Tipo tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.isShiny = isShiny;
        this.tipo = tipo;
    }

    public Pokemon() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Boolean getShiny() {
        return isShiny;
    }

    public void setShiny(Boolean shiny) {
        isShiny = shiny;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Ataque> ataques) {
        this.ataques = ataques;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
