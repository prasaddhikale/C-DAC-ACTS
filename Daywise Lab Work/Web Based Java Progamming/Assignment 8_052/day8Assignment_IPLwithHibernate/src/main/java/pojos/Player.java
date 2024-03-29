package pojos;
import javax.persistence.*;

@Entity
@Table(name="iplplayers")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer playerId;
	private String name;
	private int age;
	private int teamid;
	private int wicketsTaken;
	private int battingAvg;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String name, int teamid, int age, int wicketsTaken, int battingAvg) {
		super();
		this.name = name;
		this.teamid = teamid;
		this.age=age;
		this.wicketsTaken = wicketsTaken;
		this.battingAvg = battingAvg;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public int getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(int battingAvg) {
		this.battingAvg = battingAvg;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", teamid=" + teamid + ", wicketsTaken="
				+ wicketsTaken + ", battingAvg=" + battingAvg + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
