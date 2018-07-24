package com.testsoft.myfvpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class MyFavouritePlacesAppApplication extends SpringBootServletInitializer{
	public class MyFavouritePlacesAppApplication{	

	
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MyFavouritePlacesAppApplication.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(MyFavouritePlacesAppApplication.class, args);
	}
}
