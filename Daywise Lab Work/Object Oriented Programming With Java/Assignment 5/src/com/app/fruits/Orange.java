package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}
	public void juice() {
		System.out.println(getName()+" Extracting juice!");
	}
	@Override
	public String taste() {
		return "sour";
	}
}
