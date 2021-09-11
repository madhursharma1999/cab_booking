package com.example.cab_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.cab_booking.dao.DriverDao;
import com.example.cab_booking.dao.UserDao;
import com.example.cab_booking.entities.Driver;
import com.example.cab_booking.entities.User;
import com.example.cab_booking.entities.Vehicle;
@Component
public class DriverService {
	@Autowired
	private DriverDao driverDao;
	
	public void addDriver(Driver driver)  
	{    
		driver.setRating(5.0);
		driverDao.save(driver);
	}
	public Driver getDriver(int driver_id) {
		return driverDao.findById(driver_id).get();
	}
	
	public Boolean checkDriver(Driver driver)
	{
		String username=driver.getUsername();
		String password=driver.getPassword();
		System.out.println(username+" " +password);
		List<Driver> listOfDrivers=driverDao.findAll();
		for (int i = 0; i < listOfDrivers.size(); i++)
		{
			String currUsername=listOfDrivers.get(i).getUsername();
			String currPassword=listOfDrivers.get(i).getPassword();
			if(username.equals(currUsername) && password.equals(currPassword))
				return true;
        }
		return false;
	}
	public ModelAndView allDetails(Driver driver,ModelAndView modelAndView)
	{
		String username=driver.getUsername();
		String password=driver.getPassword();
		System.out.println(username+" " +password);
		List<Driver> listOfDrivers=driverDao.findAll();
		for (int i = 0; i < listOfDrivers.size(); i++)
		{
			String currUsername=listOfDrivers.get(i).getUsername();
			String currPassword=listOfDrivers.get(i).getPassword();
			if(username.equals(currUsername) && password.equals(currPassword))
			{
				modelAndView.addObject("id", listOfDrivers.get(i).getDriver_id());
				modelAndView.addObject("username",listOfDrivers.get(i).getUsername());
				modelAndView.addObject("email", listOfDrivers.get(i).getEmail());
				modelAndView.addObject("phone", listOfDrivers.get(i).getPhone());
			}
        }
		return modelAndView;
		
		
	}
	
	public List<Driver> getAll() 
	{
		
		return driverDao.findAll();
	}
}