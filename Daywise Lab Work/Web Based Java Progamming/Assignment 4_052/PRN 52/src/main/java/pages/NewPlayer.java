package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PlayerDaoImpl;
import dao.TeamDaoImpl;
import pojos.Player;
import pojos.Team;

/**
 * Servlet implementation class NewPlayer
 */
@WebServlet(value="/add_player_new1",loadOnStartup = 1)
public class NewPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){
			
			
			HttpSession session = request.getSession();
			PlayerDaoImpl playerDao = (PlayerDaoImpl)session.getAttribute("player_dao");
			TeamDaoImpl teamDao = (TeamDaoImpl)session.getAttribute("team_dao");
			
			if(teamDao!=null) {
			String playerFName = request.getParameter("nm");
			LocalDate dob = LocalDate.parse(request.getParameter("dob"));
			Double average = Double.parseDouble(request.getParameter("avg"));
			String playerLName = request.getParameter("lnm");
			String abbr = request.getParameter("abbrevation");
			Team team = teamDao.getTeamDetails(abbr);
			int wicketsTaken = Integer.parseInt(request.getParameter("wickets"));
			int age = Period.between(dob, LocalDate.now()).getYears();
			
			if(age< team.getMaxAge() && average>team.getMinBattingAvg() && wicketsTaken> team.getMinWicketsTaken()) {
				//String firstName, String lastName, Date dob, double battingAvg, int wicketsTaken, int teamId
				Player newPlayer = new Player(playerFName,playerLName, Date.valueOf(dob) ,average, wicketsTaken,team.getTeamId());
				
				String msg=playerDao.addPlayerToTeam(newPlayer, team.getTeamId());
				
				pw.print(msg);
				
				
			}
			else {
				pw.print("<h4>Player criteria does not satisfy</h4>");
			}
			
			}
			else {
				pw.print("<h5> No Cookies </h5>");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
