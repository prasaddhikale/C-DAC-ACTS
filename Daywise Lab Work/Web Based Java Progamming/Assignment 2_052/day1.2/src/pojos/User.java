package pojos;
/*
 * id | first_name | last_name | email          
 *    | password | dob        | status | role
 */

import java.sql.Date;
import java.util.Objects;

public class User {
	public User(int userId, String firstName, String lastName, String email, String password, Date dob,
			boolean votingStatus, String role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.votingStatus = votingStatus;
		this.role = role;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password);
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private boolean votingStatus;
	private String role;
	public User() {
		// TODO Auto-generated constructor stub
	}
	//first_name,last_name,dob,status
	public User(String firstName, String lastName, Date dob, boolean votingStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.votingStatus = votingStatus;
	}
	//getter / setters
	public int getUserId() {
		return userId;
	}
	

	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isVotingStatus() {
		return votingStatus;
	}
	public void setVotingStatus(boolean votingStatus) {
		this.votingStatus = votingStatus;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	//toString
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dob=" + dob + ", votingStatus=" + votingStatus + ", role=" + role + "]";
	}
	

}
