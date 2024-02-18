package com.BusReservation.service;

import com.BusReservation.exception.AdminException;
import com.BusReservation.exception.UserException;
import com.BusReservation.model.User;

import java.util.List;

public interface UserService {
    public User createUser(User user) throws UserException;
    public User updateUser(User user, String key) throws UserException;
    public User deleteUser(Integer userId, String key) throws UserException, AdminException;
    public User viewUserById(Integer userId, String key) throws UserException, AdminException;
    public List<User> viewAllUser(String key) throws UserException, AdminException;
}
