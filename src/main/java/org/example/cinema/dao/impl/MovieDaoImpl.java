package org.example.cinema.dao.impl;

import org.example.cinema.dao.AbstractDao;
import org.example.cinema.dao.MovieDao;
import org.example.cinema.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
