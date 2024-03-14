package tester;

import java.util.HashMap;
import static utils.CricketerUtils.checkfordup;
import java.util.Scanner;

import com.cricketer.core.Cricketer;

import customException.InvalidInputException;

public class CricketerTest {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			
			HashMap<String, Cricketer> cricks=new HashMap<>();
			boolean exit=false;
			while(!exit)
			{
				try {
//					1.Accept minimum 5 Cricketers in the collection.
//
//					2.Modify Cricketer's rating
//
//					3.Search Cricketer by name
//
//					4. Display all Cricketers added in collection.
//
//					5.Display All Cricketers in sorted form by rating.
					
					System.out.println("\n 1.Accept minimum 5 Cricketers in the collection \n 2.Modify Cricketer's rating"
							+ "\n 3.Search Cricketer by name \n 4. Display all Cricketers added in collection. "
							+ "\n 5.Display All Cricketers in sorted form by rating.");
					System.out.println("select option ");
					
					switch (sc.nextInt()) {
					case 1:
						//String name,int age,String email_id,String Phone,int rating
						System.out.println("Enter name, age, email_id, Phone, rating");
						for(int i=0;i<3;i++) {
						Cricketer crick1=new Cricketer(checkfordup(sc.next(),cricks), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
						
						cricks.put(crick1.getName(),crick1);
						System.out.println("added successfuly ");
						}
						break;
						
					case 2:
						System.out.println("give name and modified rating ");
						String crick2=sc.next();
						int rating=sc.nextInt();
						if(cricks.containsKey(crick2))
							cricks.get(crick2).setRating(rating);
						System.out.println("rating updated successfully..");
						break;
						
					case 3:
						System.out.println("enter name to search ");
						Cricketer name1=cricks.get(sc.next());
						if(name1==null)
							throw new InvalidInputException("no name found..");
						else
							System.out.println(name1);
							
						break;
						
					case 4:
						cricks.values().stream().forEach(temp-> System.out.println(temp));
						break;
						
					case 5:
						cricks.values().stream().sorted((c1, c2) -> ((Integer)c1.getRating()).compareTo(c2.getRating()))
						.forEach(temp-> System.out.println(temp)) ;
						

					default:
						break;
					}
					
				}
				catch(Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
				
			}
		}

	}

}
