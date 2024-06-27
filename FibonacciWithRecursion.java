package com.example.BasicProgramJava;

public class FibonacciWithRecursion {
	
	static int n1=0,n2=1,n3;
	
	public static void Fibo(int count) {
		if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		
		System.out.print(" "+n3);
		Fibo(count-1);
		}
	}

	public static void main(String[] args) {
		int count=10;
		System.out.print(n3);
		
		Fibo(count-1);
	}
}
