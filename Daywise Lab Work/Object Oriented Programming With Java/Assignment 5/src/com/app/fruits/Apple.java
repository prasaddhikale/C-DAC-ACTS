package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	public void jam() {
		System.out.println(getName()+" making Jam!");
	}
	@Override
	public String taste() {
		return "Sweet and sour";
	}
}
