package queue;

import java.util.Scanner;

public class CircularQueueOperations {
	public static void main(String[] args) {
	    CircularQueue q = new CircularQueue(5);
	    Scanner sc = new Scanner(System.in);
	    boolean exit = false;

	    while (!exit) {
	        System.out.println("Enter your choice: "
	        		+ "\n1.Display "
	        		+ "\n2.Enqueue "
	        		+ "\n3.Dequeue "
	        		+ "\n4.Check elements "
	        		+ "\n5.Check if Full "
	        		+ "\n6.Check if Empty "
	        		+ "n7.Exit");
	        switch (sc.nextInt()) {
	            case 1:
	                q.display();
	                break;
	            case 2:
	                System.out.println("Enter the element:");
	                q.enqueue(sc.nextInt());
	                break;
	            case 3:
	                System.out.println("Dequeued element: " + q.dequeue());
	                break;
	            case 4:
	                System.out.println("Number of elements in the queue: " + q.count());
	                break;
	            case 5:
	                System.out.println("Is the queue full? " + q.isFull());
	                break;
	            case 6:
	                System.out.println("Is the queue empty? " + q.isEmpty());
	                break;
	            case 7:
	                exit = true;
	                System.out.println("Exiting program...");
	                break;
	            default:
	                System.out.println("Invalid choice. Please enter a valid option.");
	        }
	    }
	    sc.close();
	}

}