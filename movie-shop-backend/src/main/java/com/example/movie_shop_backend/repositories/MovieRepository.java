package com.example.movie_shop_backend.repositories;

import com.example.movie_shop_backend.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>  {
// same as DAO!
}
