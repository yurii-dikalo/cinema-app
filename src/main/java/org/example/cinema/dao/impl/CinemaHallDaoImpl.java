package org.example.cinema.dao.impl;

import org.example.cinema.dao.AbstractDao;
import org.example.cinema.dao.CinemaHallDao;
import org.example.cinema.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
