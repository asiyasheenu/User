package com.springrest.user.entities;

public class Users {
	
	private String Name;
	private String Email;
	private String Gender;
	private String Password;
	
	public Users(String name, String email, String gender, String password) {
		super();
		Name = name;
		Email = email;
		Gender = gender;
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Users [Name=" + Name + ", Email=" + Email + ", Gender=" + Gender + ", Password=" + Password + "]";
	}
	
	
	

}
