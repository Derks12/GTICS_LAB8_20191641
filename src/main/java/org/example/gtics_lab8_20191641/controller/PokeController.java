package org.example.gtics_lab8_20191641.controller;

import org.example.gtics_lab8_20191641.Dao.PokemonDao;
import org.example.gtics_lab8_20191641.entity.Pokemon;
import org.example.gtics_lab8_20191641.repository.PokemonRepository;
import org.example.gtics_lab8_20191641.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemon")
public class PokeController {

    @Autowired
    PokemonDao pokemonDao;

    final PokemonRepository pokemonRepository;
    final UserRepository userRepository;

    public PokeController(PokemonRepository pokemonRepository, UserRepository userRepository) {
        this.pokemonRepository = pokemonRepository;
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{name}")
    public Pokemon getLocaciones(@PathVariable("name") String name) throws JSONException {


        return pokemonDao.obtenerLocacionPorNombre(name);

    }
}
