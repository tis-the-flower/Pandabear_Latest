package com.parik.pandabear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PandabearApplication {

	public static void main(String[] args) {
		
		System.out.println("Starting Panda Bear SpringBoot");
		SpringApplication.run(PandabearApplication.class, args);
	}

}
