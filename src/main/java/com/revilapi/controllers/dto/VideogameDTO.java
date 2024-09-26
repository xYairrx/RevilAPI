package com.revilapi.controllers.dto;

import java.util.ArrayList;
import java.util.List;

import com.revilapi.entities.Character;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VideogameDTO {
    
    private Long id;
    private String title;
    private String image;
    private List<Character> characters = new ArrayList<>();
}
