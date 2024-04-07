package com.app.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class StudentRespDto {
	@JsonProperty(access = Access.READ_ONLY)// only serializable
    private Long id;
    private String rollNo;
		
    private String firstName;
		
    private String lastName;
		
    private String city;
		
    private String courseName;
    private LocalDate dob;
   
    

}
