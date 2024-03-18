package utils;

import java.time.LocalDateTime;
import java.util.HashMap;

import core.Employees;
import custom_exception.InvalidDateAndTimeException;
import custom_exception.InvalidEmployeesException;

public class ListUtils 
{
	public static String checkForDup (String name,HashMap<String,Employees>map) throws InvalidEmployeesException
	{
		if(map.containsKey(name))
		{
			throw new InvalidEmployeesException("Duplicate Item .........");
		}return name; 
	}
	public static LocalDateTime parseLocalDateTime(String dateTime) throws InvalidDateAndTimeException

	{
		return LocalDateTime.parse(dateTime);
	}
			

}
