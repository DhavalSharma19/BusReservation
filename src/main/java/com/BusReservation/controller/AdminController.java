package com.BusReservation.controller;

import com.BusReservation.exception.AdminException;
import com.BusReservation.model.Admin;
import com.BusReservation.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/BusReservation")
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/admin/register")
    public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin admin) throws AdminException {
    	System.out.println("Admin Controller: " + admin);
        Admin savedAdmin = service.createAdmin(admin);
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    }

    @PutMapping("/admin/update")
    public ResponseEntity<Admin> updateAdmin(@Valid @RequestBody Admin admin, @RequestParam(required = false) String key) throws AdminException {
        Admin updatedAdmin = service.updateAdmin(admin, key);
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
    }

    @RequestMapping(value="/BusAvailability", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String BusAvailibility(@RequestParam("busId") Integer busId){

        Integer availableSeats = service.getAvailableSeats(busId);
        Integer totalSeats = service.getTotalSeats(busId);

        if((((totalSeats - availableSeats)*100)/totalSeats) <= 60){
            return "Green";
        }else if((((totalSeats - availableSeats)*100)/totalSeats) * 100 <= 90){
            return "Yellow";
        }else{
            return "Red";
        }

    }
}
