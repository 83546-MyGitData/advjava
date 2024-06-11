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
	private String passwd;
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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void authenticate() {
		try(UserDao userDao = new UserDaoImpl()){
			User u= userDao.findByEmail(email);
			if(u!=null && u.getPassword().equals(passwd)){
				this.user=u;
			}
			else {
				this.user=null;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
