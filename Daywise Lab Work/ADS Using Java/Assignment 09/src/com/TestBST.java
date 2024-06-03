package com;

import java.util.Scanner;

public abstract class TestBST {

	public static void main(String[] args) {

		BST bst = new BST();
		
		boolean exit=false;
		Scanner sc = new Scanner(System.in);
		while(!exit) {
			System.out.println("Enter your Choice\n"
								+" 1.Insert a data in BST\n"
								+" 2.Display Contents InOrder Traversal\n"
								+" 3.Display Contents PostOrder Traversal\n"
								+" 4.Display Contents PreOrder Traversal"
								+ " \n 5.Exit");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter a value");
				bst.insert(sc.nextInt());
				break;
			case 2:
				System.out.println("Printing in inOrder Traversal");
				bst.inOrder();
				break;
			case 3:
				System.out.println("Printing in PreOrder Traversal");
				bst.preOrder();
				break;	
			case 4:
				System.out.println("Printing in PostOrder Traversal");
				bst.postOrder();
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
