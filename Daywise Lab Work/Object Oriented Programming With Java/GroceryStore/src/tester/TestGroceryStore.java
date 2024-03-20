package tester;

import static utils.ItemUtils.checkForDuplicateItem;
import static utils.ItemUtils.parseLocalDateTime;
import static utils.PopulateGroceryStore.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

import core.Item;
import custom_error.InvalidItemException;

public class TestGroceryStore {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// HashMap<String, Item> map = new HashMap<>();
			HashMap<String, Item> map = populateGroceryList(getAll());
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("*****WELCOME TO THE GROCERY STORE*****\n");
					System.out
							.println("***************Menu**************\r\n "
									+ "1 : Add new grocery item to the list: \r\n"
									+ "2 : Update the quantity of a grocery item in stock: \r\n "
									+ "3 : Display the list of grocery items including their name, prices and quantities: \r\n"
									+ "4 : Remove all empty stock items : \r\n "
									+ "5 : Display all products for which updated in last 3 days : \r\n"
									+ "6 : Exit ");
					System.out.println("Enter choice : ");
					switch (sc.nextInt()) {

					case 1:
						System.out.println(
								"Enter grocery item name, price per unit, quantinty in stock, Local Date and Time(format YYYY-MM-DDTHrs:Min:Secs) ");
						Item it = new Item(checkForDuplicateItem(sc.next(), map), sc.nextInt(), sc.nextInt(),
								parseLocalDateTime(sc.next()));
						map.put(it.getName(), it);
						System.out.println("------------------------------------------");
						map.values().stream().forEach(p -> System.out.println(p));
						System.out.println("------------------------------------------");
						break;
					case 2:
						System.out.println("Enter name of the grocery item to new updated stock amount : ");
						String item = sc.next();
						LocalDateTime dateAndTime = LocalDateTime.now();
						int updatedQuantity = sc.nextInt();
						if (map.containsKey(item)) {
							map.get(item).setQuantity(updatedQuantity);
							map.get(item).setDateTime(dateAndTime);
						} else
							throw new InvalidItemException("Invalid Item Name !!!!!");
						System.out.println("------------------------------------------");
						System.out.println("Stock updated");
						System.out.println("------------------------------------------");
						map.values().stream().forEach(p -> System.out.println(p));
						break;
					case 3:
						System.out.println("Display Grocery item name, prices, quantites : ");
						System.out.println("------------------------------------------");
						map.values().stream().forEach(p -> System.out.println(p));
						System.out.println("------------------------------------------");
						break;
					case 4:
						System.out.println("Remove all grocery items whose stock is zero : ");
						map.entrySet().removeIf(p -> p.getValue().getQuantity() == 0);
						map.values().stream().forEach(p -> System.out.println(p));
						System.out.println("------------------------------------------");
						System.out.println("\nItem removed Successfully!!!!\n");
						System.out.println("------------------------------------------");
						break;
					case 5:
						System.out.println("Display All products for which stock updated in last 3 days");
						System.out.println("------------------------------------------");
						LocalDateTime dateAndTime1 = LocalDateTime.now().minusDays(3);
						map.values().stream().filter(p -> p.getDateTime().isAfter(dateAndTime1))
								.forEach(p -> System.out.println(p));
						System.out.println("------------------------------------------");
						break;

					case 6:
						exit = true;
						break;
					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}

//toys 12  12 2023-05-12T12:13:13