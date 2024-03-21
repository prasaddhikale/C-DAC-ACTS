package utils;

import java.time.LocalDate;
import java.util.Map;

import custom_Exception.StudentHandlingException;
import student.Course;
import student.Student;

public class StudentUtils1 {
	public static Course parseAndValidateCourse(String course) {
		return Course.valueOf(course.toUpperCase());
	}

	public static LocalDate parseDob(String dob) {
		return LocalDate.parse(dob);
	}

	public static String checkForDuplicate(String prn, Map<String, Student> students)
			throws StudentHandlingException {
		if (students.containsKey(prn))
			throw new StudentHandlingException("Duplicate PRN !!!!!");
		return prn;
	}
}
