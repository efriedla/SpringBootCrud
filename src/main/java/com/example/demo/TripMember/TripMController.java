package com.example.demo.TripMember;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("TripMembers")
public class TripMController {

	private final TripMService tripMService;
	public TripMController(TripMService tripMService){
		this.tripMService = tripMService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Tripmember>> getTripMembers(){
		List<Tripmember>  tripMembersList = tripMService.getTripMembers();
		return new ResponseEntity<>(tripMembersList, HttpStatus.OK);
	}

	@GetMapping("find/{id}")
	public ResponseEntity<Tripmember> getTripMemberById(@PathVariable("id") Long id){
		Tripmember found = tripMService.getTripMemberById(id);
		log.info("in profile "+ found.getName());
		return new ResponseEntity<>(found, HttpStatus.OK);

	}


	@PostMapping("/save")
	public ResponseEntity<Tripmember>  addTripMember(Tripmember tripmember){
		tripMService.addNewTripMember(tripmember);
		log.info("added new trip member " +  tripmember);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Tripmember> updateTripMemeber(@RequestBody Tripmember tripmember) {
		Tripmember updateTripMember = tripMService.updateTripMember(tripmember);
		return new ResponseEntity<>(updateTripMember, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTripMember(@PathVariable("id") Long id) {
		tripMService.deleteTripMember(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
