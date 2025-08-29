package com.example.api_filmes_mostra.controller;

import com.example.api_filmes_mostra.model.Filmes;
import com.example.api_filmes_mostra.service.FilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")

public class FilmesController {
    @Autowired
    private FilmesService filmesService;

    @PostMapping ("/adicionar")
    public ResponseEntity<Filmes> registrarFilme(@RequestBody Filmes filme) {
        Filmes filmeRegistrado = filmesService.registrarFilme(filme);
        return new ResponseEntity<>(filmeRegistrado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Filmes>> listarFilmes() {
        List<Filmes> filmes = filmesService.listarFilmes();
        return new ResponseEntity<>(filmes, HttpStatus.OK);
    }
}
