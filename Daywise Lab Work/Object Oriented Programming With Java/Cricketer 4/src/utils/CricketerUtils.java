package utils;

import java.util.HashMap;

import com.cricketer.core.Cricketer;

import customException.InvalidInputException;



public class CricketerUtils {
public static String checkfordup(String name, HashMap<String, Cricketer> cricketers )throws InvalidInputException
{
	if(cricketers.containsKey(name))
		throw new InvalidInputException("Dup values ");
	return name;
	}
}
