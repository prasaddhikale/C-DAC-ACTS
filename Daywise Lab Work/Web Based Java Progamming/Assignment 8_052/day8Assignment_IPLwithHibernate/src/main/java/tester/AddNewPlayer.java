package tester;

import java.util.Scanner;
import org.hibernate.*;

import dao.PlayerDao;
import dao.PlayerDaoImpl;
import pojos.Player;

import static utils.HibernateUtils.getFactory;


public class AddNewPlayer {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()){
			
			System.out.println("hibernate booted successfully ! "+sf);
			//create dao instance n call method
			PlayerDao dao=new PlayerDaoImpl();
			//int name, int teamid, int age, int wicketsTaken, int battingAvg
			System.out.println("Enter new Player details : String name, int teamid, int Age, int WicketsTaken"
					+ ", int batting avd");
			
			Player newPlayer = new Player(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			
			dao.addPlayerDetails(newPlayer);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
