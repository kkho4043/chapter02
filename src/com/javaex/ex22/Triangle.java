package com.javaex.ex22;

public class Triangle extends Ractangle implements Drawble{
	private int heightPoint;

	public int getHeightPoint() {
		return heightPoint;
	}

	public void setHeightPoint(int heightPoint) {
		this.heightPoint = heightPoint;
	}
	
	public Triangle() {
	}
	
	public Triangle(String fillColor,String lineColor,int width, int height,int heightPoint) {
		super( fillColor,lineColor,width,height);
		this.heightPoint = heightPoint;
	}
	
	public void draw() {
		System.out.println("삼각형 - #면색:" + fillColor + " #선색:" + lineColor + " #밑변:" + width + " #높이:" + height + " #높이위치:" + heightPoint);
	}
	public double area() {
		return width * height / 2;
	}
	
	
}
