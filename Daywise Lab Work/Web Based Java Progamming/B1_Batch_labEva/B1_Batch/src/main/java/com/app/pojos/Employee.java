package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_no")
	private Integer empNo;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String city;
	@Enumerated(EnumType.STRING)
	private Company companyName;
	
	public Employee() {
	
		System.out.println("in def ctor "+getClass().getName() );// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String city, Company courseName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.companyName = courseName;
	}



	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public Company getCompanyName() {
		return companyName;
	}

	public void setCompanyName(Company companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Emplolyee [empNo=" + empNo + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", companyName=" + companyName + "]";
	}

	
}
