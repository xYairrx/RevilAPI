package com.revilapi.service;

import java.util.List;
import java.util.Optional;

public interface ICharacterService {
    List<Character> findAll();

    Optional<Character> findById(Long id);

    void save(Character character);

    void deleteById(Long id);
}
