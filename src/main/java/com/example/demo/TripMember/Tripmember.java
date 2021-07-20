package com.example.demo.TripMember;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tripmember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String name;
	private String email;
	private String password;
	private LocalDate dob;

	@Transient
	private Integer age;

	//no id
	public Tripmember(String name, String email, String password, LocalDate dob) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
	}

	public int getAge(){
		return Period.between(dob, LocalDate.now()).getYears();
	}




}
