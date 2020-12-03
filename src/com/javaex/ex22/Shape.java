package com.javaex.ex22;

public abstract class Shape {
	protected String fillColor;
	protected String lineColor;
	
	
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public Shape() {
	}
	
	public Shape(String fillColor, String lineColor) {
		
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public abstract void draw();
	public abstract double area();

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
	
	
	
}
