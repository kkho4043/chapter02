package com.javaex.ex19;

public class ShapeApp {
	public static void main(String[] args) {
		
		Ractangle[] rArray = new Ractangle[3];
		Ractangle r00 = new Ractangle("»¡°­","³ë¶û",5,10);
		Ractangle r01 = new Ractangle("»¡°­","ÆÄ¶û",28,30);
		Ractangle r02 = new Ractangle("»¡°­","³ë¶û",50,100);
		
		rArray[0] = r00;
		rArray[1] = r01;
		rArray[2] = r02;
		
		for(int i = 0;i < rArray.length;i++) {
			rArray[i].draw();
		}
		
		Circle c01 = new Circle("ÆÄ¶û","ÆÄ¶û" , 5);
		c01.draw();
		
		
		
		
	}
}
