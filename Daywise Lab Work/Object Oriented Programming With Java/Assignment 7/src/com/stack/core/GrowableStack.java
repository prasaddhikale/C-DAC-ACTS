package com.stack.core;

public class GrowableStack implements Stack {
	Customer customers[];
	private int top = -1;
	Customer tempCustomerArray[];
	public GrowableStack(){
		customers=new Customer[size];
	}
	
	@Override
	public void push(Customer c) {
		if(top<size-1)
		{	customers[++top]=c; 
			System.out.println("New Customer Entered Successfully, total Customers entered = "+ top+1);
		}
		else
		{
			tempCustomerArray = new Customer[customers.length*2];
			for(int i=0;i<customers.length;i++) {
				tempCustomerArray[i] =customers[i];
			}
			customers=tempCustomerArray;
			customers[++top]=c; 
			System.out.println("\n\n\nStack Size Increased : \n\n\n");
			System.out.println("New Customer Entered Successfully, total Customers entered = "+ top+1);
			}
		}

	@Override
	public void pop() {
		
		if(top>=0)
			System.out.println(customers[top--]);
		else
			System.out.println("No data present in stack!!!!!");
	}

}
