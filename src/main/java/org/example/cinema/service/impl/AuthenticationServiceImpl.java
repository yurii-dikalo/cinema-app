package org.example.cinema.service.impl;

import java.util.Set;
import org.example.cinema.model.Role;
import org.example.cinema.model.User;
import org.example.cinema.service.AuthenticationService;
import org.example.cinema.service.RoleService;
import org.example.cinema.service.ShoppingCartService;
import org.example.cinema.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final String USER = Role.RoleName.USER.name();
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        Role userRole = roleService.getByName(USER);
        user.setRoles(Set.of(userRole));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
