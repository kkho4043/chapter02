package com.javaex.ex19;

public class ShapeApp {
	public static void main(String[] args) {
		
		Ractangle[] rArray = new Ractangle[3];
		Ractangle r00 = new Ractangle("����","���",5,10);
		Ractangle r01 = new Ractangle("����","�Ķ�",28,30);
		Ractangle r02 = new Ractangle("����","���",50,100);
		
		rArray[0] = r00;
		rArray[1] = r01;
		rArray[2] = r02;
		
		for(int i = 0;i < rArray.length;i++) {
			rArray[i].draw();
		}
		
		Circle c01 = new Circle("�Ķ�","�Ķ�" , 5);
		c01.draw();
		
		
		
		
	}
}
