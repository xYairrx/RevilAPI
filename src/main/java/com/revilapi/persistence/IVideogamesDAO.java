package com.revilapi.persistence;

import java.util.List;
import java.util.Optional;

import com.revilapi.entities.Videogame;

public interface IVideogamesDAO {

    List<Videogame> findAll();

    Optional<Videogame> findById(Long id);

    void save(Videogame videogame);

    void deleteById(Long id);


    
}
