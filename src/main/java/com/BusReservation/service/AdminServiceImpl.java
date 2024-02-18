package com.BusReservation.service;

import com.BusReservation.exception.AdminException;
import com.BusReservation.model.Admin;
import com.BusReservation.model.CurrentAdminSession;
import com.BusReservation.repository.AdminRepository;
import com.BusReservation.repository.CurrentAdminSessionRepository;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CurrentAdminSessionRepository adminSessionRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Integer getAvailableSeats(Integer busId){
        Integer obj = null;

        try{
            String query = "Select availableSeats from Bus where busId =:busId ";
            obj = entityManager.createQuery(query, Integer.class).setParameter("busId", busId).getSingleResult();

        } catch (Exception e) {
            return null;
        }

        return obj;
    }

    @Override
    public Integer getTotalSeats(Integer busId){
        Integer obj = null;

        try{
            String query = "Select seats from Bus where busId =:busId ";
            obj = entityManager.createQuery(query, Integer.class).setParameter("busId", busId).getSingleResult();

        } catch (Exception e) {
            return null;
        }

        return obj;
    }

    @Override
    public Admin createAdmin(Admin admin) throws AdminException{
//        Admin a = adminRepository.findByEmail(admin.getEmail());
        List<Admin> admins = adminRepository.findByEmail(admin.getEmail());
        
        if(!admins.isEmpty()) throw new AdminException("Admin already present with the given email: " + admin.getEmail());
        
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin, String key) throws AdminException {
        CurrentAdminSession adminSession = adminSessionRepository.findByaid(key);
        if(adminSession == null) throw new AdminException("Please enter valid key or login first!");
        if(admin.getAdminID() != adminSession.getAdminID()) throw new AdminException("Invalid admin details, please login for updating admin!");
        return adminRepository.save(admin);
    }
    	
}
