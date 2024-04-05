//package tester;
//
//import static utils.HibernateUtils.getFactory;
//
//import java.time.LocalDate;
//import java.util.Scanner;
//
//import org.hibernate.SessionFactory;
//
//import dao.PlayerDao;
//import dao.PlayerDaoImpl;
//
//import pojos.Player;
//
//public class AddNewPLayer {
//	public static void main(String[] args) {
//		try (Scanner sc = new Scanner(System.in); SessionFactory sf = getFactory()) {
//			// create dao instance
//			PlayerDao playerDao = new PlayerDaoImpl();
//			System.out.println(
//					"Enter player details : String firstName, String lastName, LocalDate dob, double battingAvg, int wicketsTaken");
//			// create transient entity /pojo
//			
//			//String firstName, String lastName, LocalDate dob, double battingAvg, int wicketsTaken
//			Player player = new Player(sc.next(), sc.next(), LocalDate.parse(sc.next()), sc.nextDouble(),sc.nextInt() );
//			//accept team id
//			System.out.println("Enter team id");			
//			System.out.println(playerDao.addNewPlayer(player, sc.nextLong()));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//}
