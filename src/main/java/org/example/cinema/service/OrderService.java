package org.example.cinema.service;

import java.util.List;
import org.example.cinema.model.Order;
import org.example.cinema.model.ShoppingCart;
import org.example.cinema.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
