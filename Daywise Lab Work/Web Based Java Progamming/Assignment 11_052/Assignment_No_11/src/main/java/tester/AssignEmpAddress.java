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

public class AssignEmpAddress {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			// create dao instance
			AddressDao adrDao = new AddressDaoImpl();
			//String adrLine1, String adrLine2, String city, String state, String country, String zipCode
			System.out.println(
					"Enter adr details : adrLine1, adrLine2, city, state, country, zipCode");
			// create transient entity /pojo
			Address adr = new Address(sc.next(), sc.next(), sc.next(), sc.next(),sc.next(), sc.next());
			//accept dept id
			System.out.println("Enter emp id");			
			System.out.println(adrDao.assignEmpAddress(adr,sc.nextLong()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
