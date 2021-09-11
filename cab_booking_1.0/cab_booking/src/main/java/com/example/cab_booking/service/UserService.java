package com.example.cab_booking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cab_booking.dao.UserDao;
import com.example.cab_booking.entities.User;

@Component
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void addUser(User userRecord)  
	{    
	userRecord.setRating(5);
	userDao.save(userRecord); 
	}    
	
	public List<User> getUserAdmin() {
		
		return userDao.findAll();
	}
	
	
	public ArrayList<ArrayList<String>> getUser() {
		
		List<User> u_list = userDao.findAll();
		
		int n=u_list.size();
		
		ArrayList<ArrayList<String> > user_list =  new ArrayList<ArrayList<String> >(n);
		
		  for (User u : u_list) {
			
			  ArrayList<String> string_list = new ArrayList<String>();
			  string_list.add(u.getUsername());
			  string_list.add(u.getEmail());
			  user_list.add(string_list);
	        }
		
		return user_list;
	}
	

}
