package com.example.api_filmes_mostra.service;

import com.example.api_filmes_mostra.model.Filmes;
import com.example.api_filmes_mostra.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class FilmesService {
    @Autowired
    private FilmesRepository filmesRepository;

    public Filmes registrarFilme(Filmes filme) {
        return filmesRepository.save(filme);
    }

    public List<Filmes> listarFilmes() {
        return filmesRepository.findAll();
    }
}
