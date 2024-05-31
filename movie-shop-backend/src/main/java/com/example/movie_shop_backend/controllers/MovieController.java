package com.example.movie_shop_backend.controllers;

import com.example.movie_shop_backend.dto.MovieDto;
import com.example.movie_shop_backend.repositories.MovieRepository;
import com.example.movie_shop_backend.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MovieController {

    private MovieService movieService;

    @PostMapping
    public ResponseEntity<MovieDto> create(@RequestBody MovieDto movieDto){
        MovieDto savedMovie = movieService.createMovie(movieDto);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }
}
