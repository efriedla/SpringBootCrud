package com.example.demo.TripMember;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// responsible for data access
@Repository
public interface ITripMRepo extends JpaRepository<Tripmember, Long> {

}
