package com.example.contactprojectSA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class ContactprojectSaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContactprojectSaApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder getBCPE(){
		return new BCryptPasswordEncoder();
	}



	@Override
	public void run(String... args) throws Exception {

	}
}
