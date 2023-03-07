package org.example.cinema.service;

import org.example.cinema.model.MovieSession;
import org.example.cinema.model.ShoppingCart;
import org.example.cinema.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
