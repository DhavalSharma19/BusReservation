package com.BusReservation.service;

import com.BusReservation.exception.AdminException;
import com.BusReservation.exception.UserException;
import com.BusReservation.model.CurrentAdminSession;
import com.BusReservation.model.CurrentUserSession;
import com.BusReservation.model.User;
import com.BusReservation.repository.CurrentAdminSessionRepository;
import com.BusReservation.repository.CurrentUserSessionRepository;
import com.BusReservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CurrentUserSessionRepository userSessionRepository;

    @Autowired
    private CurrentAdminSessionRepository adminSession;

    @Override
    public User createUser(User user) throws UserException {
        User registeredUser = userRepository.findByEmail(user.getMobile());
        if(registeredUser != null) throw new UserException("User is already registered!");
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, String key) throws UserException {
        CurrentUserSession loggedInUser = userSessionRepository.findByUuid(key);
        if(loggedInUser == null)  throw new UserException("Please enter a valid key or login first!");
        if(user.getUserID() != loggedInUser.getUserID()) throw new UserException("Invalid user details, please login for updating user!");
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(Integer userID, String key) throws UserException, AdminException {
        CurrentAdminSession loggedInAdmin = adminSession.findByaid(key);
        if(loggedInAdmin == null)  throw new AdminException("Please enter a valid key or login first!");
        User user = userRepository.findById(userID).orElseThrow(() -> new UserException("Invalid user Id!"));
        userRepository.delete(user);
        return user;
    }

    @Override
    public User viewUserById(Integer userID, String key) throws UserException, AdminException {
        CurrentAdminSession loggedInAdmin = adminSession.findByaid(key);
        if(loggedInAdmin == null)  throw new AdminException("Please enter a valid key or login first!");
        User user = userRepository.findById(userID).orElseThrow(() -> new UserException("Invalid user Id!"));
        return user;
    }

    @Override
    public List<User> viewAllUser(String key) throws UserException, AdminException {
        CurrentAdminSession loggedInAdmin = adminSession.findByaid(key);
        if(loggedInAdmin == null)  throw new AdminException("Please enter a valid key or login first!");
        List<User> list = userRepository.findAll();
        if(list.isEmpty())  throw new UserException("No users found!");
        return list;
    }
}
