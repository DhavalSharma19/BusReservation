package com.BusReservation.service;

import com.BusReservation.exception.AdminException;
import com.BusReservation.model.Admin;

public interface AdminService {
    public Admin createAdmin(Admin admin) throws AdminException;
    public Admin updateAdmin(Admin admin, String key) throws AdminException;
    public Integer getAvailableSeats(Integer busId);
    public Integer getTotalSeats(Integer busId);
}
