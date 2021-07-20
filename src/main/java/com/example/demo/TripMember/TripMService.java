package com.example.demo.TripMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TripMService {
	private final ITripMRepo iTripMRepo;

	@Autowired
	public TripMService(ITripMRepo iTripMRepo) {
		this.iTripMRepo = iTripMRepo;
	}

	public List<Tripmember> getTripMembers(){
		return iTripMRepo.findAll();
	}
}
