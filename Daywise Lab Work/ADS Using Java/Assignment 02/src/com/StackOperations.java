package com;

import java.util.Scanner;

public class StackOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		System.out.print("Enter the size of the stack: ");
		int size = sc.nextInt();

		StackCore stack = new StackCore(size);

		while (!exit) {
			try {
				System.out.println("\nSelect an operation:");
				System.out.println("1. Display the stack");
				System.out.println("2. Push data onto the stack");
				System.out.println("3. Pop data from the stack");
				System.out.println("4. Check how many elements are there on the stack");
				System.out.println("5. Check if the stack is full");
				System.out.println("6. Check if the stack is empty");
				System.out.println("7. Exit");

				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					stack.display();
					break;
				case 2:
					System.out.print("Enter the value to push: ");
					int value = sc.nextInt();
					stack.push(value);
					break;
				case 3:
					stack.pop();
					break;
				case 4:
					System.out.println("Number of elements in the stack: " + stack.size());
					break;
				case 5:
					System.out.println("Is the stack full? " + stack.isFull());
					break;
				case 6:
					System.out.println("Is the stack empty? " + stack.isEmpty());
					break;
				case 7:
					exit = true;
					System.out.println("Thanks,Exiting!!!");
					break;
				default:
					System.out.println("Invalid choice!");
				}
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
				System.out.println("Please try again!!!");
			}
		}
		sc.close();
	}
}
