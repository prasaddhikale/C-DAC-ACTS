package com.stack.core;

public class Customer {
	private int id;
	private String name;
	private String address;
	
	public Customer(int id, String name, String address) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.address = address;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Customer ID: "+getId()+", Customer Name: "+getName()+", Customer address: "+getAddress() ;
	}
	
	
}
