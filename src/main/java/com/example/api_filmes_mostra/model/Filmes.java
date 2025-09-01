package com.example.api_filmes_mostra.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_filmes")

public class Filmes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_movie;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String image_url;

    @Column(nullable = false)
    private String genres;

    @Column(nullable = false)
    private Integer year;

    public Filmes (){

    }

    public Filmes(Long id_movie, String title, String description, String image_url, String genres, Integer year) {
        this.id_movie=id_movie;
        this.title=title;
        this.description=description;
        this.image_url=image_url;
        this.genres=genres;
        this.year=year;
    }

    @JsonProperty("id_movie") public Long getId() {
        return id_movie;
    }

    @JsonProperty("id_movie") public void setId(Long id_movie) {
        this.id_movie=id_movie;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title=title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description=description; }

    public String getImage_url() { return image_url; }
    public void setImage_url(String image_url) { this.image_url=image_url; }

    public String getGenres() { return genres; }
    public void setGenres(String genres) { this.genres=genres; }

    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year=year; }

}
