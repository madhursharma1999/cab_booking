package com.example.cab_booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cab_booking.entities.Driver;
import com.example.cab_booking.entities.User;

@Repository
public interface DriverDao extends JpaRepository<Driver, Integer> {

}