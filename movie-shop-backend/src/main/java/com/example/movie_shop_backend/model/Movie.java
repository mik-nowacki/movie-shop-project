package com.example.movie_shop_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "title")
    String title;

    @Column(name = "category")
    String category;

    @Column(name = "release_year")
    Long releaseYear;

    @Column(name = "description")
    String description;

    @Column(name = "price")
    Long price;
}
