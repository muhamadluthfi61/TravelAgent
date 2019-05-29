package com.example.demo.dao;

import com.example.demo.model.*;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class FlightDao implements FlightService {
    private EntityManagerFactory emf;

    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Flight> listFlight() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Flight", Flight.class).getResultList();

    }

    @Override
    public Flight saveOrUpdateFlight(Flight flight) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Flight saved = em.merge(flight);
        em.getTransaction().commit();
        return saved;
    }

}
