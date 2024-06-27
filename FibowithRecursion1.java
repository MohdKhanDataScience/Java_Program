package com.example.BasicProgramJava;

public class FibowithRecursion1 {
	static int n1=0,n2=1,n3;
	
	public static void main(String[] args) {
		System.out.print(n1+" "+n2);
		printFibo(10);
	}
	
	static void printFibo(int i) {
		if(i>=1) 
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			printFibo(i-1);
		}
	}

}
