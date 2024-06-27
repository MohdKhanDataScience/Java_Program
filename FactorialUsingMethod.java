package com.example.BasicProgramJava;

public class FactorialUsingMethod {
	static int num=5;
	static int fact=1;
	public static void main(String[] args) {
		isFactorialOrNot();
		
	}

	public static void isFactorialOrNot() {
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is: "+num+" is "+ fact);
		
	}
}
