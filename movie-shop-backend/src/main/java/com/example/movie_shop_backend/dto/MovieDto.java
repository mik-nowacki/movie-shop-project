package com.example.movie_shop_backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDto {
    private Long id;
    private String title;
    private String category;
    private Long releaseYear;
    private String description;
    private Long price;
}
