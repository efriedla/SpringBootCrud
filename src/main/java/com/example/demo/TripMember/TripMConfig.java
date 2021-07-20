package com.example.demo.TripMember;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class TripMConfig {
	@Bean
	CommandLineRunner commandLineRunner(ITripMRepo tripMRepo) {
		return args -> {
			Tripmember bob = new Tripmember(
					"bob",
					"bob@gmail.com",
					"ldkjfskfj",
					LocalDate.of(2000, Month.APRIL,5)
			);
			Tripmember alex = new Tripmember(
					"alex",
					"alex@gmail.com",
					"lddfsdfsfkjfskfj",
					LocalDate.of(2001, Month.JANUARY,5)

			);


		 tripMRepo.saveAll(
		 		List.of(bob,alex)
		 );
		};
	}
}
