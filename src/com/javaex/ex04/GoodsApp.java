package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("����");
		camera.setPrice(40000);
		
		camera.showInfo();
		
		Goods computer = new Goods("LG�׷�",100000);
		computer.showInfo();
		
		Goods cup = new Goods("�ӱ���");
		cup.setPrice(2000);
		cup.showInfo();
	}
	
}
