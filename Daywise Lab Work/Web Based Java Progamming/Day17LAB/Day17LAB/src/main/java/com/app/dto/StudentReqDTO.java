package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentReqDTO {
	@JsonProperty(access = Access.READ_ONLY)// only serializable
    private Long id;
	@NotBlank(message = "rollNo cannot be empty")
    private String rollNo;
	@NotBlank(message = "fn cannot be empty")
    private String firstName;
	@NotBlank(message = "ln cannot be empty")
    private String lastName;
		
    private String city;
		
    private String courseName;
    @Past
    private LocalDate dob;
    
    
	}

