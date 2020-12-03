package com.javaex.ex22;

public class Point implements Drawble{
	private int x;
	private int y;
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.println("�� x = :" + x + " �� y : " + y);
	}
	
	public void showInfo() {
		System.out.println("x : " + x + " y : " + y);
	}
}
