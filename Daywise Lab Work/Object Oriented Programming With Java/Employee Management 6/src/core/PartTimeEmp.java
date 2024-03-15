package core;

import java.time.LocalDate;

public class PartTimeEmp extends Employee {
private double payment;
	public PartTimeEmp(String name, LocalDate doj, long phoneNo, String aadhaarNo, double payment) {
		super(name, doj, phoneNo, aadhaarNo);
		this.payment = payment;
	}
	@Override
	public String toString() {
		return super.toString() + "PartTimeEmp payment= " + payment ;
	}

}
