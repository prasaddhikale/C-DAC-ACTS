package com.cdac.core;
class Box{
	private double height;
	private double width;
	private double depth;
	//parametrized constructor
	Box(double h, double w, double d){		
		height = h;
		width = w;
		depth = d;
	}
	//constructor for a cube1
	Box(double side){
		this(side,side,side);
	}
	
	String getdetails(){
		return "depth : " +depth +", width : "+width ", height : "+height;
	}
	//check if other box is equal
	boolean isEqual(Box b2){
		if(this.height==b2.height && this.width==b2.width && this.depth==b2.depth)
			return true;
		return false;
	}
	//to create another box by taking offset to earlier box
	Box newOffsetBox(double h, double w, double d){
		
		Box newBox = new Box(this.height+h,this.width+w,this.depth+d);
		return newBox;
		
	}
	
	
	double getBoxVolume() {
		return width*depth*height;
	}
	
	
}