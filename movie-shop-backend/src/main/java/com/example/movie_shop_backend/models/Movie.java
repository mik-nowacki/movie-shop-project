package com.example.movie_shop_backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "release_year")
    private Long releaseYear;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Long price;
}
