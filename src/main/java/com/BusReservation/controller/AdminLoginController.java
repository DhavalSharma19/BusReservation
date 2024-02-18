package com.BusReservation.controller;

import com.BusReservation.exception.AdminException;
import com.BusReservation.exception.LoginException;
import com.BusReservation.model.AdminLoginDTO;
import com.BusReservation.model.CurrentAdminSession;
import com.BusReservation.service.AdminLoginService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/BusReservation")
public class AdminLoginController {

    @Autowired
    private AdminLoginService loginService;

    @PostMapping("/admin/login")
    public ResponseEntity<CurrentAdminSession> loginAdmin(@RequestBody AdminLoginDTO loginDTO) throws AdminException, LoginException {
    	CurrentAdminSession currentAdminSession = loginService.adminLogin(loginDTO);
        return new ResponseEntity<>(currentAdminSession, HttpStatus.ACCEPTED);
    }

    @PostMapping("/admin/logout")
    public String logoutAdmin(@RequestParam(required = false) String key) throws LoginException {
        return loginService.adminLogout(key);
    }
}
