package jspapp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import daos.UserDao;
import daos.UserDaoImpl;

public class RegistrationBean {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String birthDate;
	private String role = "voter";
	private int status = 0;
	//private User user;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public RegistrationBean() {
		
	}

	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int registration() {
		int count=0;
		Date date = Date.valueOf(birthDate);
		User user = new User(firstName, lastName, email, password, status, role);
		try(UserDao u = new UserDaoImpl()){
			count = u.save(user,date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
}




















