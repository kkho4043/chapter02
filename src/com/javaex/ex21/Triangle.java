package com.javaex.ex21;

public class Triangle extends Ractangle{
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
		System.out.println("�ﰢ�� - #���:" + fillColor + " #����:" + lineColor + " #�غ�:" + width + " #����:" + height + " #������ġ:" + heightPoint);
	}
	public double area() {
		return width * height / 2;
	}
	
	
}
