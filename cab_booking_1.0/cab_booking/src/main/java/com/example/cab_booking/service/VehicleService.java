package com.example.cab_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.cab_booking.dao.VehicleDao;
import com.example.cab_booking.entities.Vehicle;

@Service
@Component
public class VehicleService {

	
	@Autowired
	private VehicleDao dao;
	
	public String addVehicle(Vehicle vehicle) {
		dao.save(vehicle);
		return "New vehicle has been added into Database, roll number :"+vehicle.getVid();
	}
	
	public String addVehicles(List<Vehicle> vehicles) {
		dao.saveAll(vehicles);
		return "All new vehicles has been added into Database";
	}
			
	public String deleteVehicle(int vid) {
		Vehicle vehicle = dao.getById(vid);
		dao.delete(vehicle);
		return "vehicle is deleted :"+vid;
	}
	
	public String updateVehicle(Vehicle vehicle) {
		dao.save(vehicle);
		return "vehicle is update :"+vehicle.getVid();
	}
	
	public Vehicle getVehicle(int vid) {
		return dao.findById(vid).get();
	}
	
	public List<Vehicle> getVehicles() {
		return dao.findAll();
	}
	public Vehicle getVehicleslot(String vehicle_type) {
		return dao.bookslot(vehicle_type);
	}
	
	
}
