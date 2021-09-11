package com.example.cab_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.cab_booking.dao.BookingDao;
import com.example.cab_booking.entities.Booking;


@Service
@Component
public class BookingService {
	@Autowired
	private BookingDao dao;
	
	public String addBooking(Booking booking) {
		dao.save(booking);
		return "New booking is done :"+booking.getBooking_id();
	}
	public List<Booking> getBookings() {
		return dao.findAll();
		
	}
	public List<Booking> getUserBookings(int uid) {
		return dao.findByUid(uid);
		
	}
	public List<Booking> getDriverBookings(int driverid) {
		return dao.findByDriverid(driverid);
		
	}
}
