package org.example.cinema.dao;

import java.util.Optional;
import org.example.cinema.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
