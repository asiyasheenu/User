package com.springrest.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.springrest.service.Service;
import com.springrest.user.entities.Users;

@Controller
public class MyController {
	
	@Autowired
	private Service service;
		
	
	public ResponseEntity<String> registerUser(Users users){
		
		if (service.findByEmail(users.getEmail())!=null) {
			
		return new ResponseEntity<>("Email already exist",HttpStatus.BAD_REQUEST);
		}
		
		service.save(users);
			
		 return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
	}
	
	public ResponseEntity<String> validateUser(String Email,String Password) {
		Users users=service.findByEmail(Email);
		
		if (users != null && users.getPassword().equals(Password)) {
            return new ResponseEntity<>("User validated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid email or password", HttpStatus.UNAUTHORIZED);
        }
		
	}
	
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = service.getUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    
    public ResponseEntity<String> deleteUser(String email) {
        // Find the user by email
        Users users =service.findByEmail(email);

        // Check if the user exists
        if (users != null) {
            // Delete the user from the database
            service.delete(users);
            return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
    }

	
		
	
}
