package com.revilapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revilapi.entities.Videogame;
import com.revilapi.persistence.IVideogamesDAO;
import com.revilapi.service.IVideogamesService;

@Service
public class VideogamesServiceImpl implements IVideogamesService{

    @Autowired
    private IVideogamesDAO videogamesDAO;

    @Override
    public List<Videogame> findAll() {
        return videogamesDAO.findAll();
    }

    @Override
    public Optional<Videogame> findById(Long id) {
        return videogamesDAO.findById(id);
    }

    @Override
    public void save(Videogame videogame) {
        videogamesDAO.save(videogame);
    }

    @Override
    public void deleteById(Long id) {
        videogamesDAO.deleteById(id);
    }

    
}