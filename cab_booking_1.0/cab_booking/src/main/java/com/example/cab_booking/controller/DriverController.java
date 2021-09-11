package com.example.cab_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.cab_booking.entities.Driver;
import com.example.cab_booking.entities.User;
import com.example.cab_booking.service.DriverService;

@Controller
public class DriverController {
	
	@RequestMapping("/driver_signin")
	public String driverSignin()
	{
		return "driver_signin";
	}
	@RequestMapping("/driver_signup")
	public String driverSignUp()
	{
		return "driver_signup";
	}
	@Autowired
	private DriverService driverService;
	
	@RequestMapping(value="/add-driver",method = RequestMethod.POST)    
	public String addDriver(@ModelAttribute Driver driverRecored) 
	{    
		driverService.addDriver(driverRecored);
	    return "driver_successful_login";
	} 
	
	@RequestMapping(value="/check-driver",method = RequestMethod.POST)    
	public String checkDriver(@RequestParam String username, @RequestParam String password, Model model) 
	{    
		String return_page="user_login_fail";
		List<Driver> driver_list = driverService.getAll(); 
		for (Driver driver : driver_list) {
			
			if(driver.getUsername().equals(username) && driver.getPassword().equals(password)) {
				model.addAttribute("driver",driver);
				return_page = "driver_successful_login";
			}
		}

		return return_page;
	}
	
	@GetMapping("/check-driver") public String check_Driver() {
		  
		  return "driver_successful_login"; }
	
	@GetMapping("/session_invalidate_driver")
	public String session_invalidate_driver() {
		
		return "session_invalidate_driver";
	}
	
//	@RequestMapping(value="/check-driver",method = RequestMethod.POST)    
//	public ModelAndView checkDriver(@ModelAttribute Driver driverRecored,Model model) 
//	{    
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.setViewName("driver_successful_login");
//		//modelAndView.addObject("username", "Kamal Raj");
//		
//		if(driverService.checkDriver(driverRecored))
//		{
//			model.addAttribute("driver", modelAndView);
//			modelAndView=driverService.allDetails(driverRecored,modelAndView);
//			return modelAndView;
//		}
//		else 
//		{
//			modelAndView.setViewName("invalid_credentials");
//			return modelAndView;
//		}
//	}  
	
}