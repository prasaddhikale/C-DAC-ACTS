package com.stack.core;

public class FixedStack implements Stack {
	Customer customers[];
	private int top = -1;
	public FixedStack(){
		customers=new Customer[size];
	}
	@Override
	public void push(Customer c) {
		if(top<size-1)
		{	customers[++top]=c; // customer(0) will store the entered customer details in tester
			System.out.println("New Customer Entered Successfully, total Customers entered = "+ top+1);
		}
		else
			System.out.println("STACK FULL!!!!!");
				
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(top>=0)
			System.out.println(customers[top--]);
		else
			System.out.println("No data present in stack!!!!!");
	}

}
