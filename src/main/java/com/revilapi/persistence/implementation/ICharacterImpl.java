package com.revilapi.persistence.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revilapi.entities.Character;
import com.revilapi.persistence.ICharacterDAO;
import com.revilapi.repository.CharacterRepository;

@Component
public class ICharacterImpl implements ICharacterDAO{

    @Autowired
    CharacterRepository repository;

    @Override
    public List<Character> findAll() {
        return (List<Character>)repository.findAll();
    }

    @Override
    public Optional<Character> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(Character character) {
        repository.save(character);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    
}
