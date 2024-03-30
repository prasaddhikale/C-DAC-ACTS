package dao;

import java.util.List;

import pojos.Team;

public interface TeamDao {
//add a method to insert new team details
	String addTeamDetails(Team newTeam);
	Team getTeamDetails(String abbr);
	//Find out the teams , who need players with max age of the player> specified age
	
	List<Team> getTeamswithMinAge(int age);
	
	String updateAvgandWickets(int teamid,double avg,int wickets);
	
}
