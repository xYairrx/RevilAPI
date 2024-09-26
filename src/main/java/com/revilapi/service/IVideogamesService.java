package com.revilapi.service;

import java.util.List;
import java.util.Optional;

import com.revilapi.entities.Videogame;

public interface IVideogamesService {

    List<Videogame> findAll();

    Optional<Videogame> findById(Long id);

    void save(Videogame videogame);

    void deleteById(Long id);
    
}
