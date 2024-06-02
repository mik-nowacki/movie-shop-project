package com.example.movie_shop_backend.services;

import com.example.movie_shop_backend.dto.MovieDto;
import com.example.movie_shop_backend.models.Movie;
import com.example.movie_shop_backend.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ModelMapper modelMapper;

    public MovieDto createMovie(MovieDto movieDto){
        Movie movie = modelMapper.map(movieDto, Movie.class);
        Movie savedMovie = movieRepository.save(movie);
        return modelMapper.map(savedMovie, MovieDto.class);
    }

    public List<MovieDto> getAllMovies(){
        return modelMapper.map(movieRepository.findAll(), List.class);
    }

    public List<MovieDto> getMoviesByCategory(String category) {
        return modelMapper.map(movieRepository.findByCategory(category), List.class);
    }
}
