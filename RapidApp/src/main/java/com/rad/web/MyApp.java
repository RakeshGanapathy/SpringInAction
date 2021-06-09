package com.rad.web;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rad.RapidAppApplication;

public class MyApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RapidAppApplication.class, args);
		
	}

}
