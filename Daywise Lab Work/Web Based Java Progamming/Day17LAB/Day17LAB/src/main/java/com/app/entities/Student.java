package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="students")
public class Student extends BaseEntity{
	@Column(length = 20,unique = true)
String rollNo;
	@Column(length = 20)
String firstName;
	@Column(length = 20)
String lastName;
	@Column(length = 20)
String city;
	@Column(length = 20)
String courseName;
LocalDate dob;
}
