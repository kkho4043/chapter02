package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(40000);
		
		camera.showInfo();
		
		Goods computer = new Goods("LG그램",100000);
		computer.showInfo();
		
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
	}
	
}
