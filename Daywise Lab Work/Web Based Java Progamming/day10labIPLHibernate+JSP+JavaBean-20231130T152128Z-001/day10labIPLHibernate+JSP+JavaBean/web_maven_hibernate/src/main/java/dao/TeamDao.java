package dao;

import java.util.List;

import pojos.Team;

public interface TeamDao {
	public String addNewTeam(Team team);
	public List<String> getTeamsAbbreviations();
}
