package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import com.springrest.user.entities.Users;

public  class ServiceImpl implements Service{
	
	List<Users> list;
	
	public ServiceImpl() {
		list=new ArrayList<>();
		list.add(new Users("Aman","aman@gmail.com","Male","aman112"));
		list.add(new Users("Haya","haya@gmail.com","Female","haya123"));
		
	}
	
	@Override
	public Users findByEmail(String Email) {
		return null;
	
	}
	
	@Override
	public void save(Users users) {
		// TODO Auto-generated method stub
		return;
	}
	
	
	@Override
	public List<Users> getUser() {
		
		return null;
	}

	@Override
	public void delete(Users users) {
		
		
	}

	
}
