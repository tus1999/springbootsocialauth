package com.mysecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mysecurity.configs.SecurityConfig;

@SpringBootApplication
public class MySecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySecurityApplication.class, args);
	}
	@Bean
	public SecurityConfig applicationSecurity() {
		return new SecurityConfig();
	}

}
