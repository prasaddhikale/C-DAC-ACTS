package com;

import java.util.Scanner;

public class LinkListTester {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		while(!exit) {
			System.out.println("Enter your choice "
					+ "\n 1.Display contents"
					+ "\n 2.Insert data"
					+ "\n 3.Number of elements in the list"
					+ "\n 4.Check if List is Empty"
					+ "\n 0.exit");
			
			try {
				switch (sc.nextInt()) {
				
				case 1:
					linkedlist.display();
					break;
				case 2:
					
					System.out.println("Enter the element value : ");
					linkedlist.add(sc.nextInt());
					break;
				case 3:
					System.out.println(linkedlist.count());
					break;
				case 4:
					if(linkedlist.isEmpty())
						System.out.println("List is Empty");
					else
						System.out.println("List is not Empty");
					break;
				case 0:
					exit=true;
					break;
				default:
					System.out.println("Enter a valid choice");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		sc.close();
		
	}

}
