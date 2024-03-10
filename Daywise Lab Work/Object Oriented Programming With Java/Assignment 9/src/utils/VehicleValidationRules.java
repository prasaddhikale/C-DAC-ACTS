package utils;

import java.util.Date;

import custom_exceptions.SpeedOutOfRangeException;
import custom_exceptions.LicenseExpiredException;

public class VehicleValidationRules {
	// declare static constants : speed range
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static Date currDate; 
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
		currDate = new Date();
	}
//add a static method for speed validation
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too slow");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too fast , FATAL!!!!!!");
		System.out.println("speed within range....");
	}
	
	public static void validateLicense(Date date) throws LicenseExpiredException{
		
		if(date.before(currDate))
			throw new LicenseExpiredException("License is expired");
		System.out.println("License is validate");
			
	}
}
