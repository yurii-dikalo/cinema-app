package org.example.cinema.service;

import java.util.Optional;
import org.example.cinema.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
