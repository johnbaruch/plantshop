package com.plantshop;

import com.plantshop.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses=HomeController.class)
public class PlantshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantshopApplication.class, args);
	}
}
