package pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="players")
public class Player extends BaseEntity{
	

	private String firstName;
	private String lastName;
	private LocalDate dob;
	private double battingAvg;
	private int wicketsTaken;
	
	@ManyToOne
	@JoinColumn(name="team_id")//optional BUT reco.
	private Team myTeam;
	public Player() {
		
	}
	public Player(String firstName, String lastName, LocalDate dob, double battingAvg, int wicketsTaken) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
	
	}


	public Team getMyTeam() {
		return myTeam;
	}

	public void setMyTeam(Team myTeam) {
		this.myTeam = myTeam;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("In firstname setter");
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("In last name setter");
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		
		this.dob = dob;
	}
	public double getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	
	@Override
	public String toString() {
		return "Player [ firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}
	
}
