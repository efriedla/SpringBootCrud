package com.example.demo.TripMember;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TripMService {
	public List<Tripmember> getTripMembers(){
		return List.of(
				new Tripmember(
						1L,
						"bob",
						"bob@gmail.com",
						"ldkjfskfj",
						LocalDate.of(2000, Month.APRIL,5),
						21
				)
		);
	}
}
