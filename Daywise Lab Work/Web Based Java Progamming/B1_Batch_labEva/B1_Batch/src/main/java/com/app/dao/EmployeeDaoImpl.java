package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Company;
import com.app.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private EntityManager mgr;

	@Override
	public String addEmployee(Employee stud) {
		// TODO Auto-generated method stub
		mgr.persist(stud);
		return "Employee added successfully";
	}

	@Override
	public List<Employee> displayEmployee() {
		String jpql = "select s from Employee s";
		return mgr.createQuery(jpql, Employee.class).getResultList();
	}

	@Override
	public List<Employee> findByCompany(Company myCompany) {
		String jpql = "select s from Employee s where s.companyName=:company";
		return mgr.createQuery(jpql, Employee.class).setParameter("company", myCompany).getResultList();
	}

}
