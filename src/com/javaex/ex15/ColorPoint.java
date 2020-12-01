package com.javaex.ex15;

public class ColorPoint extends Point{
	protected String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public ColorPoint() {
		
	}
	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y , String color) {
		super(x,y);
		this.color = color;
	}
	
	
	public void showInfo() {
		System.out.println("x : " + x + "y : " + y + "color : " + color);
	}
}
