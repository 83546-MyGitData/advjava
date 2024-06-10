package jspapp;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import daos.UserDao;
import daos.UserDaoImpl;

public class LoginBean {
	private String email;
	private String password;
	private User user;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public LoginBean() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void authenticate() {
		try(UserDao u = new UserDaoImpl()){
			u.findByEmail(email);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
