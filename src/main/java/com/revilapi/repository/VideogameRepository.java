package com.revilapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revilapi.entities.Videogame;

@Repository
public interface VideogameRepository extends CrudRepository<Videogame, Long>{
    
}
