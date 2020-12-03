package com.javaex.ex22;

public class Circle extends Shape implements Drawble{


	private int radius;

	public Circle() {

	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor,lineColor);
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원 - #면색:"+fillColor + " #선색:" +lineColor + " #지름:" + radius);
	}
	public double area() {
		return radius * radius * 3.14;
	}
	
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}

	
}
