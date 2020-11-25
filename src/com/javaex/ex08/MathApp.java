package com.javaex.ex08;

public class MathApp {
	public static void main(String[] args) {
		Math myMath = new Math();
		
		int sum01 = myMath.plus(3, 5);
		System.out.println(sum01);
		double sum02 = myMath.plus(2.3, 5.5);
		System.out.println(sum02);
	}
}
