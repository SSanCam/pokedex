package com.es.api.pokedex.repository;

import com.es.api.pokedex.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepositoryAPI extends JpaRepository <Pokemon, Long> {



}
