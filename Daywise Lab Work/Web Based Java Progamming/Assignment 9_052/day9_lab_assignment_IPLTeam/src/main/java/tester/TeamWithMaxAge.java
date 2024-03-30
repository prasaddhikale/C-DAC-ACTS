package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TeamDao;
import dao.TeamDaoImpl;

public class TeamWithMaxAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in);
				SessionFactory sf=getFactory()) {
			System.out.println("hibernate booted successfully ! "+sf);
			//create dao instance n call method
			TeamDao dao=new TeamDaoImpl();
			
			System.out.println("Enter the Max Age ");
			
			dao.getTeamswithMinAge(sc.nextInt()).forEach(t->System.out.println(t));}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
