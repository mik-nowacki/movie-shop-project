package com.example.movie_shop_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private Long id;
    private String title;
    private String category;
    private Long releaseYear;
    private String description;
    private Long price;
}
