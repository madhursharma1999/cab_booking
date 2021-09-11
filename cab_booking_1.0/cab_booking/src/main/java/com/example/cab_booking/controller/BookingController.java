package com.example.cab_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.cab_booking.entities.Booking;
import com.example.cab_booking.entities.Driver;
import com.example.cab_booking.entities.Vehicle;
import com.example.cab_booking.service.BookingService;
import com.example.cab_booking.service.DriverService;
import com.example.cab_booking.service.VehicleService;

@Controller
public class BookingController {
	
	@RequestMapping(value="/book_page")
	public String method1() {
		return "book_page";
	}
	
	@RequestMapping(value="/book_history_user")
	public String method2() {
		return "book_history_user";
	}
	@RequestMapping(value="/book_driver",method = RequestMethod.POST)
	public String bookDriver(@RequestParam(value = "uid") String uid,Model m) {
		System.out.println(uid);
		m.addAttribute("uid",uid);
		return "book_driver";
	}
	@Autowired    
	private VehicleService vehicleService;
	@Autowired    
	private DriverService driverService;
	@Autowired    
	private BookingService bookingService;
	@RequestMapping(value="/book_driver_success",method = RequestMethod.POST)
	public String bookDriverr(@RequestParam(value = "uid") int uid,@RequestParam(value = "distance") int distance,@RequestParam(value = "vehicle_type") String vehicle_type,Model m) {
		System.out.println(uid);
		System.out.println(distance);
		System.out.println(vehicle_type);
		Vehicle vehicle = new Vehicle();
		Driver driver = new Driver();
		vehicle = vehicleService.getVehicleslot(vehicle_type);
		driver=driverService.getDriver(vehicle.getVid());
		System.out.println(vehicle.getVid());
		System.out.println(driver.getDriver_id());
		System.out.println("Total fare="+(vehicle.getCharge()*distance));
		Booking booking = new Booking();
		booking.setDriverid(driver.getDriver_id());
		booking.setUid(uid);
		booking.setDistance(distance);
		booking.setTotal_fare(distance*vehicle.getCharge());
		bookingService.addBooking(booking);
		m.addAttribute(booking);
		m.addAttribute(driver);
		m.addAttribute(vehicle);
		return "book_driver_success";
	}
	@RequestMapping(value="/user_booking_history")
	public String bookHistory(@RequestParam(value = "uid") int uid,Model  n) {
		System.out.println(uid);
		List<Booking> b=bookingService.getUserBookings(uid);
		//List<Booking> c=bookingService.getBookings();
		String str="manish";
		n.addAttribute("b", b);
		for(Booking bh:b) {
			System.out.println(bh.getDriverid());
		}
		//m.addObject("hello","manish");
		return "user_booking_history";
	}
	
	@RequestMapping(value="/driver_booking_history")
	public String bookHistorydriver(@RequestParam(value = "did") int did,Model  n) {
		System.out.println(did);
		List<Booking> b=bookingService.getDriverBookings(did);
		//List<Booking> c=bookingService.getBookings();
		String str="manish";
		n.addAttribute("b", b);
		for(Booking bh:b) {
			System.out.println(bh.getUid());
		}
		//m.addObject("hello","manish");
		return "driver_booking_history";
	}
	
	
}
