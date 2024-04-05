package dao;

import pojos.Player;
//import pojos.Team;

public interface PlayerDao {
//	public void addNewPlayer(Player player,String teamAbbr);
//	public String addNewPlayer(Player player, Long teamId) ;
	public String addPlayer(String abbr, Player p);
}
