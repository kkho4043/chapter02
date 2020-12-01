package com.javaex.ex18;

public class PointApp {
	private static final String ColorPoint = null;

	public static void main(String[] args) {
		

		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Point p3 = new Point(3,3);
		Point cp1 = new ColorPoint(5,5,"red");
		Point cp2 = new ColorPoint(10,10,"blue");
		
		Point[] poArray = new Point[5];
		
		poArray[0] = p1;
		poArray[1] = p2;
		poArray[2] = p3;
		poArray[3] = cp1;
		poArray[4] = cp2;
		
		for(int i = 0; i < poArray.length ; i++) {
			poArray[i].showInfo();
		}
		
		((ColorPoint)poArray[4]).setColor("green");
		for(int i = 0; i < poArray.length ; i++) {
			poArray[i].showInfo();
		}
	}
}
