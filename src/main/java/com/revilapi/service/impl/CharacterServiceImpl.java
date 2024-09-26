package com.revilapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revilapi.entities.Character;
import com.revilapi.persistence.ICharacterDAO;

@Service
public class CharacterServiceImpl implements ICharacterDAO{

    @Autowired
    private ICharacterDAO characterDAO;

    @Override
    public List<Character> findAll() {
        return characterDAO.findAll();
    }

    @Override
    public Optional<Character> findById(Long id) {
        return characterDAO.findById(id);
    }

    @Override
    public void save(Character character) {
        characterDAO.save(character);
    }

    @Override
    public void deleteById(Long id) {
        characterDAO.deleteById(id);
    }
    
}
