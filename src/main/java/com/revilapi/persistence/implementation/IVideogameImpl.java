package com.revilapi.persistence.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revilapi.entities.Videogame;
import com.revilapi.persistence.IVideogamesDAO;
import com.revilapi.repository.VideogameRepository;

@Component
public class IVideogameImpl implements IVideogamesDAO{

    @Autowired
    private VideogameRepository repository;

    @Override
    public List<Videogame> findAll() {
        return (List<Videogame>) repository.findAll();
    }

    @Override
    public Optional<Videogame> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Videogame videogame) {
        repository.save(videogame);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    
}
