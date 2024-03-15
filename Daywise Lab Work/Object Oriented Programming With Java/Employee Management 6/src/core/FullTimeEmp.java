package core;

import java.time.LocalDate;

public class FullTimeEmp extends Employee{
	private double sal;
	public FullTimeEmp(String name, LocalDate doj, long phoneNo, String aadhaarNo,double sal) {
		super(name, doj, phoneNo, aadhaarNo);
		this.sal = sal;
	}
	@Override
	public String toString() {
		return super.toString()+"FullTimeEmp sal= " + sal;
	}

}
