package com.app.tester;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basket Size : ");
		Fruit[] basket = new Fruit[sc.nextInt()];
		boolean exit = false;
		
		int cnt = 0;
		while (!exit)
		{
			System.out.println("Enter your choice : \n1.Add Mango\n" + "2.Add Orange\n" + "3.Add Apple\n"
					+ "4.Display names of all fruits in the basket\n"
					+ "5.Display name, color, weight, tastse of all fresh fruits in the basket\n"
					+ "6.Mark a fruit in a basket as stale\n" + "7.Mark all sour fruits stale\n"
					+ "8.Invkoe fruit specific functionality : Pulp/Juice/Jam\n" + "9.Exit");
			switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter the color of the fruit,  weight,  name");
			basket[cnt++] = new Mango(sc.next(), sc.nextDouble(), sc.next(), true);
			break;
		case 2:
			System.out.println("Enter the color of the fruit,  weight,  name");
			basket[cnt++] = new Orange(sc.next(), sc.nextDouble(), sc.next(), true);
			break;
		case 3:
			System.out.println("Enter the color of the fruit,  weight,  name");
			basket[cnt++] = new Apple(sc.next(), sc.nextDouble(), sc.next(), true);
			break;
		case 4:

			for (Fruit f : basket) {
				if (f != null) {
					System.out.println(f.getName());
				}
			}
			break;
		case 5:
			for (Fruit f : basket) {
				if (f != null && f.isFresh()) {
					System.out.println(f + " "+f.taste());
				}
			}
			break;
		case 6:
			System.out.println("Enter the index of fruit which you want to mark stale : ");
			int i = sc.nextInt();
			if (i >= 0 && i < cnt) {
				basket[i].setStale();
			}
			break;
		case 7:
			System.out.println("Marking all sour fruits stale");
			for (Fruit f : basket) {
				if (f != null && f.taste()=="sour") {
					f.setStale();
					}
			}
			break;
		case 8:
			System.out.println("Enter the Index at which you want to Pulp/Juice/Jam \n");
			i=sc.nextInt();
			Fruit f = basket[i];
			if(f!=null) {
				if(f instanceof Apple) {
					((Apple) f).jam();
				}
				if(f instanceof Mango) {
					((Mango) f).pulp();
				}
				if(f instanceof Orange) {
					((Orange) f).juice();
				}
			}
			break;
		case 9:
			System.out.println("\n ---------------------------------------------------- \n BYE ....");
			exit=true;
			break;

		default:
			exit=true;
			break;
		}
		}
		sc.close();
		
	}

}
