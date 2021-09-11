package com.example.cab_booking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
public class Vehicle {
	
	@Id
	private int vid;
	private String vehicle_model;
	private String reg_no;
	private String vehicle_type;
	private int charge;
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVehicle_model() {
		return vehicle_model;
	}
	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	public Vehicle(int vid, String vehicle_model, String reg_no, String vehicle_type, int charge) {
		super();
		this.vid = vid;
		this.vehicle_model = vehicle_model;
		this.reg_no = reg_no;
		this.vehicle_type = vehicle_type;
		this.charge = charge;
	}
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
