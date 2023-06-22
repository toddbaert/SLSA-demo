package com.toddbaert.slsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlsaApplication {

	public static void main(String[] args) {
		System.out.println("Hello SLSA");
		SpringApplication.run(SlsaApplication.class, args);
	}

}
