package com.cdac.core;

public class Point2D {
	int x;
	int y;
	
	//parameterized constructor is created
	public Point2D(int x,int y) {
		this.x=x;
		this.y=y;
		}
	
	//show method is created
	public String show() {
		return " x= " + this.x + " y= " + this.y ;
	}
	
	
	//Add a non static  , isEqual method to Point2D class 
	//boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
	public boolean isEqual(Point2D point2) {
		if(this.x != point2.x)
		{
			return false;
		}
		if(this.y !=point2.y)
		{
			return false;
		}
		return true; 
	}
	
	//Add a non static method , calculateDistance , to calc distance between 2 points
	public double calculateDistance(Point2D p2) {
		return Math.sqrt(Math.pow((this.x - p2.x), 2) + Math.pow((this.y - p2.y), 2));
	}
	
}
