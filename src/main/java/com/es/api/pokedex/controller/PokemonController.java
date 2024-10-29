package com.es.api.pokedex.controller;

import com.es.api.pokedex.dto.PokemonDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon") // URI hasta este punto es localhost:8080/pokemon
public class PokemonController {

    @GetMapping("/{id}")
    // Los corchetes afectan // URI localhost:8080/pokemon/{id}   4 {id} cambia por 4, no hace falta escribir el ?
    public PokemonDTO getById(
            @PathVariable String id

    ) {
        // TODO
        return null;
    }


    @GetMapping("/") // URI -> localhost:8080/pokemon/
    public List<PokemonDTO> getAll() {
        return null;
    }

    @PostMapping("/")
    public PokemonDTO insert(
            @RequestBody PokemonDTO pokemonDTO
    ) {
        return null;
    }

    @PutMapping("/{id}")
    public PokemonDTO update(
            @RequestBody PokemonDTO pokemonDTO,
            @PathVariable String id
    ) {
        return null;
    }

}
