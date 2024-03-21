package tester;

import static utils.BinIOUtils.restoreStudentDetails;
import static utils.BinIOUtils.storeStudentDetails;
import static utils.StudentUtils.getAll;
import static utils.StudentUtils.populateStudentMap;
import static utils.StudentUtils1.checkForDuplicate;
import static utils.StudentUtils1.parseAndValidateCourse;
import static utils.StudentUtils1.parseDob;

import java.util.Map;
import java.util.Scanner;

import student.Student;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {

			Map<String, Student> map = populateStudentMap(getAll());
			System.out.println("Enter file name");

			storeStudentDetails(map, sc.nextLine());

			System.out.println("Enter file name");
			Map<String, Student> restoredMap = restoreStudentDetails(sc.nextLine());

			System.out.println("Students contents : ");
			restoredMap.forEach((k, v) -> System.out.println(v));

			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options \r\n" + "1. Student Admission\r\n" + "2. Cancel Admission\r\n"
							+ "3. Update marks\r\n" + "4. Exit");
					System.out.println("Choose");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter student PRN");
						// => no dups!

						System.out.println(
								"Enter details : prn, firstName,  lastName,address,  marks,  enrolledCourse,  dob");
						Student s = new Student(checkForDuplicate(sc.next(), map), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), parseAndValidateCourse(sc.next()), parseDob(sc.next()));
						map.put(s.getPrn(), s);
						System.out.println("student admitted!");
						map.values().stream().forEach(p->System.out.println(p));
						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
