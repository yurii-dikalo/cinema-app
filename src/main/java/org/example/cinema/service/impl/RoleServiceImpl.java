package org.example.cinema.service.impl;

import java.util.NoSuchElementException;
import org.example.cinema.dao.RoleDao;
import org.example.cinema.model.Role;
import org.example.cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(
                () -> new NoSuchElementException("No such role with name: " + roleName)
        );
    }
}
