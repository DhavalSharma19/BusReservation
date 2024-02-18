package com.BusReservation.service;

import com.BusReservation.exception.LoginException;
import com.BusReservation.model.CurrentUserSession;
import com.BusReservation.model.UserLoginDTO;

public interface UserLoginService {
    public CurrentUserSession userLogin(UserLoginDTO userLoginDTO) throws LoginException;
    public String userLogout(String key) throws LoginException;
}
