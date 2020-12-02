package com.javaex.ex20;

public class ShapeApp {
	public static void main(String[] args) {
		Shape[] sArray = new Shape[2];
		
//		Ractangle r = new Ractangle("ÆÄ¶û","»¡°­",10,20);
		Shape r01 = new Ractangle("³ë¶û","»¡°­",100,50);
		
		Shape c01 = new Circle("ÆÄ¶û","ÃÊ·Ï",50);
		
		sArray[0] = r01;
		sArray[1] = c01;
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	} 
}
