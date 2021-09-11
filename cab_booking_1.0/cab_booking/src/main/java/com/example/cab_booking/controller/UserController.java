package com.example.cab_booking.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.cab_booking.entities.User;
import com.example.cab_booking.service.UserService;

@Controller
public class UserController {


	@Autowired    
	private UserService userServiceLayer;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/user_signin")
	public String userSignin() {
		return "user_signin";
	}

	@RequestMapping("/user_signup")
	public String userSignup() {
		return "user_signup";
	}

	@RequestMapping(value="/add-user",method = RequestMethod.POST)    
	public String addUser(@ModelAttribute User userRecord,Model model) 
	{    model.addAttribute("user",userRecord);
		userServiceLayer.addUser(userRecord); 
		return "user_login_success";
	}    

	@RequestMapping(value="/login-user",method = RequestMethod.POST)    
	public String loginUser(@RequestParam String username, @RequestParam String password, Model model) 
	{    
		String return_page="user_login_fail";
		List<User> user_list = userServiceLayer.getUserAdmin(); 
		for (User user : user_list) {
			
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				model.addAttribute("user",user);
				return_page = "user_login_success";
			}
		}

		return return_page;
	}
	
	
	  @GetMapping("/login-user") public String login_user() {
	  
	  return "user_login_success"; }
	 
	
	@GetMapping("/session_invalidate")
	public String session_invalidate() {
		
		return "session_invalidate";
	}
}
