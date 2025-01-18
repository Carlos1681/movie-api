package com.movielist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movielist.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
