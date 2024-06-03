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

@CrossOrigin("*")
@Controller
@AllArgsConstructor
@RequestMapping()
public class MovieController {

    private MovieService movieService;

    @PostMapping("/movie/add")
    public ResponseEntity<MovieDto> create(@RequestBody MovieDto movieDto){
        MovieDto savedMovie = movieService.createMovie(movieDto);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

    @GetMapping("/movies")
    public ResponseEntity<List<MovieDto>> getAll(){
        List<MovieDto> allMovies = movieService.getAllMovies();
        return new ResponseEntity<>(allMovies, HttpStatus.OK);
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable Long id){
        MovieDto movieDto = movieService.getMovieById(id);
        return new ResponseEntity<>(movieDto, HttpStatus.OK);
    }

    @GetMapping("/movies/{category}")
    public ResponseEntity<List<MovieDto>> getMoviesByCategory(@PathVariable String category){
        List<MovieDto> moviesByCategory = movieService.getMoviesByCategory(category);
        return new ResponseEntity<>(moviesByCategory, HttpStatus.OK);
    }



}
