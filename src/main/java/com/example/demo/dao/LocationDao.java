package com.example.demo.dao;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class LocationDao implements LocationService {

    private EntityManagerFactory emf;

    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Location> listLocation() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Location", Location.class).getResultList();

    }

    @Override
    public Location saveOrUpdateLocation(Location location) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Location saved = em.merge(location);
        em.getTransaction().commit();
        return saved;
    }

    @Override
    public Location getIdLocation(int id) {
        EntityManager em = emf.createEntityManager();
        return em.find(Location.class, id);
    }

    @Override
    public void deleteLocation(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Location.class, id));
        em.getTransaction().commit();
    }
}
