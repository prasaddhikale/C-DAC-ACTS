package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResp {
	
	private String message;
	private LocalDateTime time;
	
	
	public ApiResp(String messString)
	{
		message=messString;
		time=LocalDateTime.now();
	}

}
