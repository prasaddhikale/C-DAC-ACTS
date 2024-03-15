package tester;

import java.time.LocalDate;
import static utils.BinIOUtils.*;
import java.util.HashMap;
import java.util.Scanner;

import core.Employee;
import core.FullTimeEmp;
import core.PartTimeEmp;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {

			HashMap<Integer, Employee> map = new HashMap<>();
			boolean exit = false;
			try {
				while (!exit) {
//					map.values().stream().forEach(p -> System.out.println(p));
//					System.out.println("----------------------------------------------------------------------\n");
					System.out.println("1: Add full time employee\r\n" + "2: Add part time employee\r\n"
							+ "3: Delete an employee by Emp Id\r\n" + "4: Search employee details by Aadhaar number\r\n"
							+ "5: Display all employee details\r\n"
							+ "6: Display all employee details sorted by date of joining\r\n" + "7: Exit");
					System.out.println("Choose an option: ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Details: Name, Date of Joining, Phone number, Aadhar No., Salary");
						FullTimeEmp emp = new FullTimeEmp(sc.next(), LocalDate.parse(sc.next()), sc.nextLong(),
								sc.next(), sc.nextDouble());
						map.put(emp.getEmpId(), emp);
						break;
					case 2:
						System.out.println("Enter Details: Name, Date of Joining, Phone number, Aadhar No., Payment");
						PartTimeEmp emp1 = new PartTimeEmp(sc.next(), LocalDate.parse(sc.next()), sc.nextLong(),
								sc.next(), sc.nextDouble());
						map.put(emp1.getEmpId(), emp1);
						break;

					case 3:
						System.out.println("Enter EmpId to delete");
						int tempId = sc.nextInt();
						if (map.containsKey(tempId)) {
							map.remove(tempId);
						} else {
							System.out.println("Invalid id");
						}
						break;

					case 4:
						System.out.println("Enter aadhar number: ");
						String tempA = sc.next();
						map.values().stream().filter(p -> p.getAadhaarNo().equals(tempA))
								.forEach(p -> System.out.println(p));
						break;
					case 5:
						map.values().stream().forEach(p -> System.out.println(p));
						break;

					case 6:
						map.values().stream().sorted((e1, e2) -> e1.getDoj().compareTo(e2.getDoj()))
								.forEach(p -> System.out.println(p));
						break;
					
					case 7:
						exit = true;
						break;
					}
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}


