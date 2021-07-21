package com.example.demo.TripMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

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

	public void addNewTripMember(@RequestBody Tripmember tripmember) {
		Optional byEmail =  iTripMRepo.findByEmail(tripmember.getEmail());
		if(byEmail.isPresent()){
			System.out.println("****OPPPSSS******");
			throw new IllegalStateException("Email taken");
		}else{
			System.out.println(tripmember);
			iTripMRepo.save(tripmember);
		}

	}

	public void deleteTripMember(Long id) {
		boolean exists =  iTripMRepo.existsById(id);
		if(!exists){
			throw new IllegalStateException("does not exists" + id);
		}
		iTripMRepo.deleteById(id);
	}
}
