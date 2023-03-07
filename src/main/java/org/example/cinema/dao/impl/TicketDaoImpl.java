package org.example.cinema.dao.impl;

import org.example.cinema.dao.AbstractDao;
import org.example.cinema.dao.TicketDao;
import org.example.cinema.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
