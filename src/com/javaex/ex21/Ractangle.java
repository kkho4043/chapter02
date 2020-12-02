package com.javaex.ex21;

public class Ractangle extends Shape{
	protected int width;
	protected int height;
	
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
		System.out.println("�簢�� - #���:" + fillColor + " #����:" + lineColor + " #����:" + width + " #����:" + height);
	}
	public double area() {
		return width * height;
	}
	
	
}
