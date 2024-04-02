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

public class GetAddressById {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			// create dao instance
			AddressDao adrDao = new AddressDaoImpl();
			System.out.println("Enter emp id , to get address");
			Address empAdr= adrDao.getEmpAddress(sc.nextLong());
			if (empAdr != null) {
				System.out.println(empAdr.getClass());
				System.out.println(empAdr);
			} else
				System.out.println("Emp id invalid !!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
