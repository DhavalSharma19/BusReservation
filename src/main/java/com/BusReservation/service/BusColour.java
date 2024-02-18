package com.BusReservation.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class BusColour {

    @PersistenceContext
    EntityManager entityManager;

    public Integer solve(Integer busId){
        Integer obj = null;

        try{
            String query = "Select availableSeats from Bus where busId =:busId ";
            obj = entityManager.createQuery(query, Integer.class).setParameter("busId", busId).getSingleResult();

        } catch (Exception e) {
            return null;
        }

        return obj;
    }

}
