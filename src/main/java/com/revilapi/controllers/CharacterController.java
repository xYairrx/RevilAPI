package com.revilapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revilapi.controllers.dto.CharacterDTO;
import com.revilapi.service.ICharacterService;

@RestController
@RequestMapping(path = "api/v1/characters")
public class CharacterController {

    @Autowired
    private ICharacterService characterService;

    @GetMapping
    public RequestBody<?> findAll() {

        List<CharacterDTO> characterDTO = characterService
                .findAll()
                .stream()
                .map(character -> CharacterDTO
                        .builder()
                        .id(character.))
                .toList();
    }

}
