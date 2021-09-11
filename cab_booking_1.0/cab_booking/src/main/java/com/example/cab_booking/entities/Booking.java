package com.example.cab_booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="bookings")
public class Booking {

	@Autowired
	private int uid;
	@Autowired
	private int driverid;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int booking_id;
	private int distance;
	private int total_fare;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(int total_fare) {
		this.total_fare = total_fare;
	}
	
	public Booking(int uid, int driverid, int booking_id, int distance, int total_fare) {
		super();
		this.uid = uid;
		this.driverid = driverid;
		this.booking_id = booking_id;
		this.distance = distance;
		this.total_fare = total_fare;
	}
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


}
