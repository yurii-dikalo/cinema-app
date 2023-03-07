package org.example.cinema.service;

import org.example.cinema.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
