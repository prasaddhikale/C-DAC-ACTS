package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	public void pulp() {
		System.out.println(getName()+" Creating pulp!");
	}
	@Override
	public String taste() {
		return "Sweet";
	}
	
}
