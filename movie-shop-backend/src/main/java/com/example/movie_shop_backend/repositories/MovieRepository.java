package com.example.movie_shop_backend.repositories;

import com.example.movie_shop_backend.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
