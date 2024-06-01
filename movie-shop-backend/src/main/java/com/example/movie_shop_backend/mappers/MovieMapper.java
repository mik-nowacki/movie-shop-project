package com.example.movie_shop_backend.mappers;

import com.example.movie_shop_backend.dto.MovieDto;
import com.example.movie_shop_backend.models.Movie;

import java.util.List;

public class MovieMapper {

    public static MovieDto mapToMovieDto(Movie movie) {
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getCategory(),
                movie.getReleaseYear(),
                movie.getDescription(),
                movie.getPrice()
        );
    }

    public static Movie mapToMovie(MovieDto movieDto) {
        return new Movie(
                movieDto.getId(),
                movieDto.getTitle(),
                movieDto.getCategory(),
                movieDto.getReleaseYear(),
                movieDto.getDescription(),
                movieDto.getPrice()
        );
    }
}



