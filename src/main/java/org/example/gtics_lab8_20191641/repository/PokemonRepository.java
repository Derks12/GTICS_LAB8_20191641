package org.example.gtics_lab8_20191641.repository;


import org.example.gtics_lab8_20191641.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository  extends JpaRepository<Pokemon, Integer> {

    public Pokemon findByName(String name);
}
