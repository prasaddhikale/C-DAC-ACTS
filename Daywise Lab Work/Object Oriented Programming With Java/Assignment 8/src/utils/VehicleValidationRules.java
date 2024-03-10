package utils;

import java.util.Date;

import custom_exception.LicenseExpiredException;
import custom_exception.SpeedOutOfRangeException;

public class VehicleValidationRules {
	public static final int MAXSPEED;
	public static final int MINSPEED;
	static {
		MAXSPEED = 80;
		MINSPEED= 40;
	}
	
	
	public static void checkSpeed(int speed) throws SpeedOutOfRangeException {
		if(speed>MAXSPEED)
			throw new SpeedOutOfRangeException("TOO FAST!!!");
		if(speed<MINSPEED)
			throw new SpeedOutOfRangeException("TOO SLOW!!!");
		else
		System.out.println("Speed in range");	
	}
	public static void checkLicenseExpiry(Date d) throws LicenseExpiredException{
		Date curDate = new Date();
		if(curDate.after(d))
			throw new LicenseExpiredException("LICENSE IS EXPIRED PLEASE RENEW");
		else
			System.out.println("License not Expired");
	}
	
}
