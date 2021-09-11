package com.example.cab_booking.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab_booking.entities.Driver;
import com.example.cab_booking.service.DriverService;

@RestController
public class DriverRestController {
	@Autowired
	private DriverService driverService;
	
	@RequestMapping("/admin/get-all-drivers")
	public List<Driver> getAllDrivers()
	{
		return driverService.getAll();
	}
	@RequestMapping("/user/greetings")
	public String greetings()
	{
		return "Hello User ";
	}
	

}
