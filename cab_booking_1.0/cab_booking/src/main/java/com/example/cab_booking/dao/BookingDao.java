package com.example.cab_booking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cab_booking.entities.Booking;



@Repository
public interface BookingDao extends JpaRepository<Booking, Integer>{
	List<Booking> findByUid(int uid);
	List<Booking> findByDriverid(int driverid);
}
