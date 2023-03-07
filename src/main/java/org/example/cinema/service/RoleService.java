package org.example.cinema.service;

import org.example.cinema.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
