package com.example.cab_booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="drivers")
public class Driver {
	
//	@Autowired
//	private Vehicle vehicle_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driver_id;
	private String username;
	private String password;
	private String phone;
	private String email;
	private double rating;
	
//	public Vehicle getVehicle_id() {
//		return vehicle_id;
//	}
//	public void setVehicle_id(Vehicle vehicle_id) {
//		this.vehicle_id = vehicle_id;
//	}
	public int getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public Driver( int driver_id, String username, String password, String phone, String email,
			double rating) {
		super();
		this.driver_id = driver_id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.rating = rating;
	}
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}