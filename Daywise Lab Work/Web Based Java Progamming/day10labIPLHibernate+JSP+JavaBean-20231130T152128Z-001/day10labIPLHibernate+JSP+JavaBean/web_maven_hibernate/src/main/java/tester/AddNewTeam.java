package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TeamDao;
import dao.TeamDaoImpl;

import pojos.Team;

public class AddNewTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
			TeamDao dao = new TeamDaoImpl();
			System.out.println("Enter new team details : String name, String abbreviation, String owner, int maxAge, double minBattingAvg,\r\n"
					+ "			int minWicketsTaken");
			System.out.println(dao.addNewTeam(new Team(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt())));
			
			//String name, String abbreviation, String owner, int maxAge, double minBattingAvg,
			//int minWicketsTaken
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
