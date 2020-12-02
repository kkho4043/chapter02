package com.javaex.ex21;

public class ShapeApp {
	public static void main(String[] args) {
		Shape[] sArray = new Shape[3];
		
//	
		Shape r01 = new Ractangle("³ë¶û","»¡°­",100,50);
		
		Shape c01 = new Circle("ÆÄ¶û","ÃÊ·Ï",50);
		
		Shape t01 = new Triangle("»¡°­","ÃÊ·Ï",30,20,5);
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			System.out.println("³ÐÀÌ : " + sArray[i].area());
		}
	
	} 
}
