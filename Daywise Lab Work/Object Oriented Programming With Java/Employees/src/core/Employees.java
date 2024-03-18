package core;

import java.time.LocalDateTime;

public class Employees {
	private int id;
	private String name;
	private int sallary;
	private LocalDateTime dateTime;
	private String place;

	public Employees(int id, String name, int sallary, LocalDateTime dateTime, String place) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
		this.dateTime = dateTime;
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSallary() {
		return sallary;
	}

	public void setSallary(int sallary) {
		this.sallary = sallary;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sallary=" + sallary + ", dateTime=" + dateTime + ", place="
				+ place + "]";
	}

}
