package utils;

import java.time.LocalDateTime;
import java.util.HashMap;

import core.Item;
import custom_error.InvalidItemException;
import custom_error.InvalidDateAndTimeException;;

public class ItemUtils {
	public static String checkForDuplicateItem(String name, HashMap<String, Item> map) throws InvalidItemException {
		if (map.containsKey(name)) {
			throw new InvalidItemException("Duplicate item Detected !!!!!");
			// throws exception if duplicate item name detected
		}
		return name;
	}

	public static LocalDateTime parseLocalDateTime(String dateTime) throws InvalidDateAndTimeException {
		// parses string to date and time
		return LocalDateTime.parse(dateTime);
		// throws exception if input date and time is invalid
	}
}
