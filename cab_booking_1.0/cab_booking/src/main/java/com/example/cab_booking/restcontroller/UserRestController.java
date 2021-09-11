package com.example.cab_booking.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab_booking.entities.User;
import com.example.cab_booking.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired    
	private UserService userServiceLayer;
	
	@RequestMapping("/admin/get-all-user")
	public List<User> getAllUserAdmin() {
		return userServiceLayer.getUserAdmin();
	}
	
	@RequestMapping("/user/get-all-user")
	public ArrayList<ArrayList<String>> getAllUser() {
		return userServiceLayer.getUser();
	}

}
