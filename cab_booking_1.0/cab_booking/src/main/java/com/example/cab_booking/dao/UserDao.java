package com.example.cab_booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cab_booking.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
}
