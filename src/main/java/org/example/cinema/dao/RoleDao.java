package org.example.cinema.dao;

import java.util.Optional;
import org.example.cinema.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
