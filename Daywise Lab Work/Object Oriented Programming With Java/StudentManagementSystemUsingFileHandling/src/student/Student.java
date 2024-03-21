package student;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
	private String prn;
	private String fname;
	private String lname;
	private String address;
	private double marks;
	private Course course;
	private LocalDate dob;

	public Student(String prn, String fname, String lname, String address, double marks, Course course, LocalDate dob) {
		super();
		this.prn = prn;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.marks = marks;
		this.course = course;
		this.dob = dob;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getPrn() {
		return prn;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getAddress() {
		return address;
	}

	public Course getCourse() {
		return course;
	}

	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", marks="
				+ marks + ", course=" + course + ", dob=" + dob + "]";
	}
	
	
	
}
