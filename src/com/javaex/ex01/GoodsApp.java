package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		
		camera.setPrice(40000);
		
		camera.setName("니콘");
		String cameraName = camera.getName();
		
		camera.setPrice(10000);
		int cameraPice = camera.getPrice();
		
		camera.showInfo();
		
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		String computerName = computer.getName();
		
		computer.setPrice(100000);
		int computerPrice = computer.getPrice();
		
		computer.showInfo();
		
	}

}
