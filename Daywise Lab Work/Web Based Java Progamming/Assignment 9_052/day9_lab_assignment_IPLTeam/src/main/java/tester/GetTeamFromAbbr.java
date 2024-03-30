package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TeamDao;
import dao.TeamDaoImpl;

public class GetTeamFromAbbr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()) {
			System.out.println("hibernate booted successfully ! "+sf);
			//create dao instance n call method
			TeamDao dao=new TeamDaoImpl();
			
			System.out.println("\n\nEnter the Abbreviation of the team");
			System.out.println(dao.getTeamDetails(sc.next()));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
