package com.cdac.tester;
import java.util.Scanner;

import com.cdac.core.Point2D;

public class Point2D_Tester {
	
	public static void main(String[] args) {
		//scanner is created
		Scanner sc= new Scanner(System.in);
		
		//x and y coordinates are entered for point1
		System.out.println("Enter x and y coordinates for the point ");
		Point2D p1= new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println("The coordinates of the point are ");
		System.out.println(p1.show());
		
		//x and y coordinates are entered for point2; 
		System.out.println("Enter x and y coordinates for the point ");
		Point2D p2= new Point2D(sc.nextInt(),sc.nextInt());
		
		if(p1.isEqual(p2)==true) {
			System.out.println("Points are Equal");
		}
		else
		{
			System.out.println("Points are Not Equal");
			System.out.println("The distance between points is " + p1.calculateDistance(p2));
			
		}
		
		sc.close();
		

	}

}
