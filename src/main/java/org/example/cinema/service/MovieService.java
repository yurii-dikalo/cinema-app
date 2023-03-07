package org.example.cinema.service;

import java.util.List;
import org.example.cinema.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
