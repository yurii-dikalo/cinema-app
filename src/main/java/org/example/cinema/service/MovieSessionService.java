package org.example.cinema.service;

import java.time.LocalDate;
import java.util.List;
import org.example.cinema.model.MovieSession;

public interface MovieSessionService {
    List<MovieSession> findAvailableSessions(Long movieId, LocalDate date);

    MovieSession add(MovieSession session);

    MovieSession get(Long id);

    MovieSession update(MovieSession movieSession);

    void delete(Long id);
}
