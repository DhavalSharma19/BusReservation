package com.BusReservation.service;

import com.BusReservation.exception.AdminException;
import com.BusReservation.exception.LoginException;
import com.BusReservation.model.AdminLoginDTO;
import com.BusReservation.model.CurrentAdminSession;

public interface AdminLoginService {
    public CurrentAdminSession adminLogin(AdminLoginDTO loginDTO) throws LoginException, AdminException;
    public String adminLogout(String key) throws LoginException;
}
