package com.revilapi.controllers.dto;

import com.revilapi.entities.Videogame;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CharacterDTO {

    private Long id;
    private String name;
    private String image;
    private Videogame videogame;
}
