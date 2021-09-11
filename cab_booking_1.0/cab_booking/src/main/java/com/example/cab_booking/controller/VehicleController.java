package com.example.cab_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.cab_booking.entities.Vehicle;
import com.example.cab_booking.service.VehicleService;

@Controller
public class VehicleController {
	
	@RequestMapping(value="/add_vehicle",method = RequestMethod.POST)
	public String addVehicle(@RequestParam(value = "did") String did,Model m) {
		System.out.println(did);
		m.addAttribute("did",did);
		return "add_vehicle";
	}
	
	@Autowired    
	private VehicleService vehicleServiceLayer;

	@RequestMapping(value="/add-vehicle",method = RequestMethod.POST)    
	public String addVehicleSave(@ModelAttribute Vehicle vehicleRecord) 
	{    
		vehicleServiceLayer.addVehicle(vehicleRecord); 
		return "driver_successful_login";
	} 
	
	@RequestMapping(value="/view_vehicle",method = RequestMethod.POST)
	public String viewVehicle(@RequestParam(value = "did") int did,Model m) {
		Vehicle vehicle=vehicleServiceLayer.getVehicle(did);
		m.addAttribute("vehicle",vehicle);
		return "view_vehicle";
	}
	
	
}
