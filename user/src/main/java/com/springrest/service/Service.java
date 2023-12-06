package com.springrest.service;

import java.util.List;

import com.springrest.user.entities.Users;

public interface Service {
	
	Users findByEmail(String Email);
	
	void save(Users users);

	public List<Users> getUser();

	void delete(Users users);

	

	
	

	
	

}
