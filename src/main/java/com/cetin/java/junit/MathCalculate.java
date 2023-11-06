package com.cetin.java.junit;

public class MathCalculate {
	private static final double PI = 3.14;
	public int add(int num1, int num2){
		return num1+num2;
	}

	public int divide(int num1, int num2){
		return num1/num2;
	}

	public double competeCircleArea(int radius){
		return PI*radius*radius;
	}
}
