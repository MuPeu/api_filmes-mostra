package com.example.api_filmes_mostra.repository;

import com.example.api_filmes_mostra.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FilmesRepository extends JpaRepository<Filmes, Long> {
    // Aqui você pode adicionar métodos personalizados se necessário
}
