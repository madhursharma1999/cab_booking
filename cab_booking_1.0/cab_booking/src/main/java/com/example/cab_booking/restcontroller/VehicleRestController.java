package com.example.cab_booking.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab_booking.entities.Vehicle;
import com.example.cab_booking.service.VehicleService;

@RestController
public class VehicleRestController {
	@Autowired
	private VehicleService vehicleService;
	
	    //Add Student Record
		@PostMapping("/addVehicle")
		public String addVehicle(@RequestBody Vehicle vehicle) {
			return vehicleService.addVehicle(vehicle);
		}
		//adding multipe vehicle Records
		@PostMapping("/bulkAddVehicle")
		public String addVehicles(@RequestBody List<Vehicle> vehicles) {
			return vehicleService.addVehicles(vehicles);
		}
		//delete vehicle Record
		@DeleteMapping("/delVehicle/{vid}")
		public String deleteVehicle(@PathVariable int vid) {
			return vehicleService.deleteVehicle(vid);
		}
		//update vehicle Record
		@PutMapping("/editVehicle")
		public String updateVehicle(@RequestBody Vehicle vehicle) {
			return vehicleService.updateVehicle(vehicle);
		}	
		//list all vehicle Record
		@RequestMapping("/admin/allVehicle")
		//@GetMapping(value="/all",produces=MediaType.APPLICATION_XML_VALUE)	
		public List<Vehicle> getVehicles() {
			 List<Vehicle> s =  vehicleService.getVehicles();
			 return s;
		}	 
		//list vehicle Record by id
		@RequestMapping("/user/allVehicle/{vid}")
		public Vehicle getVehicle(@PathVariable int vid) {
			return vehicleService.getVehicle(vid);
		}
	
}
