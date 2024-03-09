package com.stack.tester;

import java.util.Scanner;
import com.stack.core.*;
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = null;
		boolean exit = false;
		int stackSelected=0;
		
		while (!exit) {
				
			System.out.println("1 -- Choose Fixed Stack\r\n" + "2 -- Choose Growable Stack\r\n" + "3 -- Push data \r\n "
					+ "4 --- Pop data & display the same " + "5 -- Exit\r\n");
			switch (sc.nextInt()) {
			case 1:
				if(stackSelected==0)
				{
					stack = new FixedStack();
					System.out.println("FixedStack Created");
					stackSelected=1;
				}
				else {
					System.out.println("Stack is already selected");
				}
				break;
			case 2:
				if(stackSelected==0)
				{
					stack = new GrowableStack();
					System.out.println("Growable Stack Created");
					stackSelected=1;
				}
				else {
					System.out.println("Stack is already selected");
				}

				break;
			case 3:
				if(stack==null) // or we can use stackselected = 0
					System.out.println("No stack chosen");
				else {
				System.out.println("Adding new Customer");
				System.out.println("Enter id, name , address :");
				stack.push(new Customer(sc.nextInt(),sc.next(),sc.next()));
				}
				break;
			case 4:
				if(stack==null)
					System.out.println("No stack chosen");
				else {
					stack.pop();
				}
				
				break;
			case 5:
				exit=true;
				break;
			default:
				break;
			}
		}
		sc.close();
		
	}

}
