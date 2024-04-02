package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddressDao;
import dao.AddressDaoImpl;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojos.Address;
import pojos.Employee;
import pojos.EmploymentType;

public class GetEmpLastNameByCity {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			// create dao instance
			EmployeeDao empDao = new EmployeeDaoImpl();
			System.out.println("Enter the city , to get emp's last name");
			String lastName= empDao.displayLastNamesOfEmp(sc.next());
			
			System.out.println(lastName);
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
