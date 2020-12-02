package com.javaex.ex20;

public class Ractangle extends Shape{
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public Ractangle() {
	}
	
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Ractangle(String fillColor,String lineColor,int width, int height) {
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		System.out.println("�簢�� - ��� : " + fillColor + "���� : " + lineColor + "���� : " + width + "���� : " + height);
	}
	public double area() {
		return width * height;
	}
	
	
}
