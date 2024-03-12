package utils;

import java.time.LocalDate;

public class TaskUtils {
	public static LocalDate parseDate(String taskDate) {
		return LocalDate.parse(taskDate);
	}
	
//	public static int checkForDup(int taskid, HashMap<Integer, Task> hashmap) throws InvalidInputException {
//		if (hashmap.containsKey(taskid))
//			throw new InvalidInputException("Dup Task!!!!!");
//		return taskid;
//	}
}
