package com.revilapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revilapi.entities.Character;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long>{
    
}
