package com.example.cab_booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.cab_booking.entities.Vehicle;


@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Integer> {
		@Query(value = "SELECT * FROM Vehicle where vehicle_type = :vehicle_type  ORDER BY RAND() LIMIT 1", nativeQuery = true)
		Vehicle bookslot(@Param("vehicle_type") String vehicle_type);
}
