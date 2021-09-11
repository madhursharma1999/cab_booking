package com.example.cab_booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//adding below line just to exclude database connection for time being
//otherwise it will generate error regarding database connection

@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class })
public class CabBookingApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CabBookingApplication.class, args);
	}

}
