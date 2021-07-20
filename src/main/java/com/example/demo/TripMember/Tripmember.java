package com.example.demo.TripMember;

import lombok.*;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	private Integer age;

	//no id
	public Tripmember(String name, String email, String password, LocalDate dob, Integer age) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.age = age;
	}




}
