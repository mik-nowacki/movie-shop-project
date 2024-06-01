package com.example.movie_shop_backend.services;

import com.example.movie_shop_backend.dto.MovieDto;
import com.example.movie_shop_backend.mappers.MovieMapper;
import com.example.movie_shop_backend.models.Movie;
import com.example.movie_shop_backend.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public MovieDto createMovie(MovieDto movieDto){
        Movie movie = MovieMapper.mapToMovie(movieDto);
        Movie savedMovie = movieRepository.save(movie);
        return MovieMapper.mapToMovieDto(savedMovie);
    }

}
