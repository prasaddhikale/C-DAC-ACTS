package com.app.dao;

import java.util.List;

import com.app.pojos.Company;
import com.app.pojos.Employee;

public interface EmployeeDao {
	public String addEmployee(Employee stud);

	public List<Employee> displayEmployee();

	public List<Employee> findByCompany(Company myCourse);
}
