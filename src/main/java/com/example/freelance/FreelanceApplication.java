package com.example.freelance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.time.*;

@SpringBootApplication
@EnableMongoRepositories
public class FreelanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelanceApplication.class, args);
		LocalDateTime a = LocalDateTime.now(ZoneId.of("Africa/Tunis"));
		LocalTime b = LocalTime.now(ZoneId.systemDefault());
		System.out.println(b);
	}

}
