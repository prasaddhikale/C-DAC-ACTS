package core;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

	public static int counter = 1;
	private int empId;
	private String name;
	private LocalDate doj;
	private long phoneNo;
	private String aadhaarNo;
	private double salary;
	private double payment;

	public Employee(String name, LocalDate doj, long phoneNo, String aadhaarNo) {
		super();
		this.empId = counter++;
		this.name = name;
		this.doj = doj;
		this.phoneNo = phoneNo;
		this.aadhaarNo = aadhaarNo;
	}

	@Override
	public String toString() {
		return "EmpId" + empId + "Employee name=" + name + ", doj=" + doj + ", phoneNo=" + phoneNo + ", aadhaarNo="
				+ aadhaarNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aadhaarNo, doj, empId, name, payment, phoneNo, salary);
	}


	}


