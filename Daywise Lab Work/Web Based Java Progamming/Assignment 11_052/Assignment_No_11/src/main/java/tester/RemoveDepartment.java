package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.DepartmentDao;
import dao.DepartmentDaoImpl;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojos.Employee;
import pojos.EmploymentType;

public class RemoveDepartment {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			// create dao instance
			DepartmentDao deptDao = new DepartmentDaoImpl();
			System.out.println(
					"Enter dept name to be removed");
				System.out.println(deptDao.removeDepartment(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
