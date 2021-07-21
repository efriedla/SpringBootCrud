package com.example.demo.TripMember;

import org.springframework.web.bind.annotation.*;

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

	@DeleteMapping(path = "{tripMemberId}")
	public void deleteMember(@PathVariable("tripMemberId") Long id){
		tripMService.deleteTripMember(id);
	}
}
