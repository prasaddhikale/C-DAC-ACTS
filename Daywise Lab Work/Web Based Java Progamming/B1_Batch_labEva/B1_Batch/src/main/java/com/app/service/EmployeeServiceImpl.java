package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.pojos.Company;
import com.app.pojos.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	@Override
	public String addEmployee(Employee employee) {
		String addEmployee = empDao.addEmployee(employee);
		return addEmployee;
	}
	@Override
	public List<Employee> displayEmployee() {
		List<Employee> list = empDao.displayEmployee();
		return list;
	}
	@Override
	public List<Employee> findByCompany(Company myCompany) {
		List<Employee> list = empDao.findByCompany(myCompany);
		return list;
	}

}
