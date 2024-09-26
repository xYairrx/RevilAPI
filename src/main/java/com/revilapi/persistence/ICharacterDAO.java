package com.revilapi.persistence;

import java.util.List;
import java.util.Optional;

import com.revilapi.entities.Character;


public interface ICharacterDAO {

    List<Character> findAll();

    Optional<Character> findById(Long id);

    void save(Character character);

    void deleteById(Long id);
    
}
