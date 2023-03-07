package org.example.cinema.dao;

import java.util.List;
import org.example.cinema.model.Order;
import org.example.cinema.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
