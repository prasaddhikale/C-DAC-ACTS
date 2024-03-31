package beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDaoImpl;
import dao.TeamDaoImpl;
import pojos.Player;
public class UserBean {
	
	
	PlayerDaoImpl playerDao = new PlayerDaoImpl();
	TeamDaoImpl teamDao = new TeamDaoImpl();
	private String teamAbbr;
	private String firstName;
	private String lastName;
	private String dob;
	private double battingAvg;
	private int wicketsTaken;
	
	public UserBean() {	
		 
	}
	
	public String getTeamAbbr() {
		return teamAbbr;
	}


	public void setTeamAbbr(String teamAbbr) {
		this.teamAbbr = teamAbbr;
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


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		System.out.println("In dob setter");
		this.dob = dob;
	}


	public double getBattingAvg() {
		return battingAvg;
	}


	public void setBattingAvg(double battingAvg) {
		System.out.println("In batting avg setter");
		this.battingAvg = battingAvg;
	}


	public int getWicketsTaken() {
		return wicketsTaken;
	}


	public void setWicketsTaken(int wicketsTaken) {
		System.out.println("In wickets Taken setter");
		this.wicketsTaken = wicketsTaken;
	}
	
	public List<String> showTeamAbbr(){
		List<String> teamAbbrs = new ArrayList<String>();
		
		//teamAbbrs.add("CSK");
		teamAbbrs = teamDao.getTeamsAbbreviations();
		return teamAbbrs;
	}

	
	public String addPlayer() {
		//String firstName, String lastName, LocalDate dateOfBirth, double battingAverage, Integer wicketsTaken
//		Player p = new Player(firstName, lastName, LocalDate.parse(dob), battingAvg, wicketsTaken);
//		String mesg = "Player could not be added!!";
//		
//		playerDao.addPlayer(teamAbbr, p);
//		mesg="Player added sussessfully!!";
//		return mesg;
		

		Player p = new Player(firstName, lastName, LocalDate.parse(dob), battingAvg, wicketsTaken);
		//String mesg = "Player could not be added!!";
		
		
		String mesg=playerDao.addPlayer(teamAbbr, p);
		return mesg;
	} 
	
	
}
