package com.javaex.ex05;

public class PointApp {
	public static void main(String[] args) {
		Point po1 = new Point();
		po1.setX(5);
		po1.setY(7);
		po1.draw();
		
		Point po2 = new Point(100,100);
		po2.draw();
		po2.draw(true);
		po2.draw(false);
		
		Point po3 = new Point(7);
		po3.setY(9);
		po3.draw();
	}
}
