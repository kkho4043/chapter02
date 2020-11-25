package com.javaex.ex01;

class Goods {
	
	private String name;
	private int price;
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int p) {
		this.price = p;
	}
	public int getPrice() {
		return price;
	}
	
	
	public void showInfo() {
	
		System.out.print("教前捞抚 : " + name + "\n");
		System.out.print("教前啊拜 : " + price + "\n\n");
		
	}
	
	
}
