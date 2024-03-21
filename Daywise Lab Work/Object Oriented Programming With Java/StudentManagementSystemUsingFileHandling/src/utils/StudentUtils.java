package utils;

import static utils.StudentUtils1.parseAndValidateCourse;
import static utils.StudentUtils1.parseDob;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import student.Student;

public interface StudentUtils {
	public static List<Student> getAll() {
		return Stream.of(
				new Student("101", "Bhavesh", "Kolhe", "Bhusawal", 99.9, parseAndValidateCourse("dbda"),
						parseDob("2000-11-28")),
				new Student("102", "Gaurav", "Hiwase", "Nagpur", 99.99, parseAndValidateCourse("dbda"),
						parseDob("1999-09-04")),
				new Student("103", "Himanshu", "Bendale", "Jalgaon", 98, parseAndValidateCourse("dac"),
						parseDob("2001-09-14")),
				new Student("104", "Hritik", "Joshi", "Mumbai", 97, parseAndValidateCourse("desd"),
						parseDob("2000-04-16")),
				new Student("105", "Aniket", "Sontate", "Pune", 100, parseAndValidateCourse("dac"),
						parseDob("1947-08-15")))
				.collect(Collectors.toList());
	}

	public static Map<String, Student> populateStudentMap(List<Student> list) {
		Map<String, Student> studentMap = new HashMap<>();
		for (Student s : list) {
			studentMap.put(s.getPrn(), s);
		}
		return studentMap;
	}
}
