package com.example.movie_shop_backend.controllers;

import com.example.movie_shop_backend.dto.MovieDto;
import com.example.movie_shop_backend.repositories.MovieRepository;
import com.example.movie_shop_backend.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @PostMapping
    public ResponseEntity<MovieDto> create(@RequestBody MovieDto movieDto){
        MovieDto savedMovie = movieService.createMovie(movieDto);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

//    @GetMapping("/movies")
//    public ResponseEntity<List<MovieDto>> getAll(){
//        List<MovieDto> allMovies =
//    }
}
