package tester;

import static utils.PetUtils.checkAdmin;
import static utils.PetUtils.checkPetid;
import static utils.PetUtils.checkUser;
import static utils.PetUtils.checkduporderId;

import java.util.HashMap;
import java.util.Scanner;

import core.Category;
import core.Order;
import core.Pet;
import core.Status;
import exception.InvalidInputException;

public class PetManagemnet {
	public static void main(String[]args) throws InvalidInputException {
		try(Scanner sc = new Scanner (System.in)){
		HashMap<Integer,Pet>pet=new HashMap<>();
		HashMap<Integer,Order>order=new HashMap<>();
		boolean adminAuth=false;
		boolean userAuth=false;
		boolean exit=false;
		
		while(!exit) {
		//	System.out.println("A.admin login\n B.user login");
			System.out.println("A.admin login\n B.user login");
			switch (sc.next()) {
			case "A":
				
					System.out.println("Enter admin id");
					String id=sc.next();
					System.out.println("Enter password");
					String pass=sc.next();
					if(checkAdmin(id,pass))
					{
					//throw new AuthorizationException("Login failed");
				System.out.println("1.Add new pet\n 2.Update pet details\n 3.Update order status\n"
						+ "4.Display all available pets\n   0.exit");
				  
				 
					switch(sc.nextInt()) {
					case 1:
						//String name, Category category, double uPrice, int stock
						System.out.println("Enter pet  name, category,  uPrice,  stock  ");
						Pet p1 = new Pet(sc.next(),Category.valueOf(sc.next()),sc.nextDouble(),sc.nextInt());
						pet.put(p1.getPetId(), p1);
					 System.out.println("Pet added succesfully");
					 break;
					 
					case 2:
						System.out.println("Enter id to update Pet information");
						int i=sc.nextInt();
						if(pet.containsKey(i))
						{
							System.out.println("Enter pet  name, category,  uPrice,  stock  ");
							String name=sc.next();
							Category c =Category.valueOf(sc.next());
							double price=sc.nextDouble();
							int stock=sc.nextInt();
							Pet p=pet.get(i);
							p.setName(name);
							p.setCategory(c);
							p.setuPrice(price);
							p.setStock(stock);
						}
						else
							throw new InvalidInputException("Wrong infromation");
						break;
						
					case 3:
						System.out.println("Enter order id to update order status");
					     int orderId=sc.nextInt();	
					     Order o=checkduporderId(orderId, order);
					     o.setStatus(Status.COMPLETED);
						
						break;
					case 4:
					pet.values().stream().forEach(System.out::println);
						break;
						
					case 5:
					break;
					case 0:
					exit=true;
					break;
					}
			}  
				break;
				
			case "B":
				System.out.println("Enter user id");
				String id1=sc.next();
				System.out.println("Enter password");
				String pass1=sc.next();
				if(checkUser(id1, pass1))
				System.out.println("1.Display all available pets\n 2.Order a pet 3.Check order status\n 0.exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("All available pets");
					pet.values().stream().forEach(System.out::println);;
					break;
				case 2:
					System.out.println("Enter PetId to order pet");
					int petId=sc.nextInt();
					System.out.println("Enter Quantity");
					int quantity=sc.nextInt();	
				    Pet p1 = checkPetid(petId, pet);
				    Order o = new Order(petId, quantity);
					order.put(o.getOrderId(), o);
					p1.setStock(p1.getStock() - o.getQuantity() );	
					break;
				
				case 3:
					System.out.println("Enter order id to check order status");
					int orderId=sc.nextInt();
					Order o1=order.get(orderId);
					System.out.println(o1.getStatus());
					break;
				default:
					break;
				}
				break;
			
			default:
				break;
			}
		}
		}
	}
}
