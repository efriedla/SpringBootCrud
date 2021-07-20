package com.example.demo.TripMember;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("TripMembers")
public class TripMController {

	private final TripMService tripMService;
	public TripMController(TripMService tripMService){
		this.tripMService = tripMService;
	}
	@GetMapping("/all")
	public List<Tripmember> getTripMembers(){
		return tripMService.getTripMembers();
	}

	@PostMapping("/save")
	public void addTripMember(Tripmember tripmember){
		tripMService.addNewTripMember(tripmember);
	}
}
