package org.example.cinema.dao.impl;

import java.util.Optional;
import org.example.cinema.dao.AbstractDao;
import org.example.cinema.dao.RoleDao;
import org.example.cinema.exception.DataProcessingException;
import org.example.cinema.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> query = session.createQuery(
                    "FROM Role WHERE roleName = :roleName", Role.class);
            query.setParameter("roleName", roleName);
            return query.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Role with name " + roleName + " not found", e);
        }
    }
}
