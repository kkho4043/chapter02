package com.javaex.ex22;

public class ShapeApp {
	public static void main(String[] args) {
		Point p = new Point(7, 8);
		p.draw();

		Drawble[] dArray = new Drawble[4];

		Drawble r01 = new Ractangle("»¡°­", "»¡°­", 4, 4);

		Drawble c01 = new Circle("º¸¶ó", "ÆÄ¶û", 7);

		Drawble t01 = new Triangle("»¡", "ÁÖ", 7, 8, 9);

		Drawble p01 = new Point(5, 5);

		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;

		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		System.out.println("================");
		for (int i = 0; i < dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
			
		}
	}
}
