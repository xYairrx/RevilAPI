package com.revilapi.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revilapi.controllers.dto.VideogameDTO;
import com.revilapi.entities.Videogame;
import com.revilapi.service.IVideogamesService;

@RestController
@RequestMapping(path = "/api/v1/videogames")
public class VideogamesController {

    @Autowired
    private IVideogamesService videogamesService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<VideogameDTO> videogamesDTO = videogamesService
                .findAll()
                .stream()
                .map(videogame -> VideogameDTO
                        .builder()
                        .id(videogame.getId())
                        .title(videogame.getTitle())
                        .image(videogame.getImage())
                        .characters(videogame.getCharacters()).build())
                .toList();

        return ResponseEntity.ok(videogamesDTO);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        Optional<Videogame> videogameOptional = videogamesService.findById(id);

        if (videogameOptional.isPresent()) {

            Videogame videogame = videogameOptional.get();
            VideogameDTO videogameDTO = VideogameDTO.builder()
                    .id(videogame.getId())
                    .title(videogame.getTitle())
                    .image(videogame.getImage())
                    .characters(videogame.getCharacters())
                    .build();

            return ResponseEntity.ok(videogameDTO);

        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Videogame not founded");

    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody VideogameDTO videogameDTO) throws URISyntaxException {

        if (videogameDTO.getTitle().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        videogamesService.save(Videogame.builder()
                .title(videogameDTO.getTitle())
                .image(videogameDTO.getImage())
                .build());

        return ResponseEntity.created(new URI("/api/v1/videogames")).build();

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<?> update(@RequestBody VideogameDTO videogameDTO, @PathVariable Long id)
            throws URISyntaxException {

        Optional<Videogame> optional = videogamesService.findById(id);

        if (optional.isPresent()) {

            Videogame videogame = optional.get();
            videogame.setTitle(videogameDTO.getTitle());
            videogame.setImage(videogameDTO.getImage());
            videogamesService.save(videogame);

            return ResponseEntity.ok("Videogame modified");
        }

        return ResponseEntity.notFound().build();

    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {

        Optional<Videogame> optional = videogamesService.findById(id);

        if (optional.isPresent()) {

            videogamesService.deleteById(id);

            return ResponseEntity.ok("Videogame eliminated");

        }

        return ResponseEntity.badRequest().build();

    }

}