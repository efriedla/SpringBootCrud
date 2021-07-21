package com.example.demo.TripMember;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// responsible for data access
@Repository
public interface ITripMRepo extends JpaRepository<Tripmember, Long> {


	// Select * From Tripmember Where email = email
//	@Query("Select * From Tripmemeber t Where t.email = ?1")
	Optional<Tripmember> findByEmail(String email);
}
