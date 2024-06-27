package com.example.BasicProgramJava;

import java.util.Scanner;

public class PrintEvenOddBetweenRange {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++) {
			if(i%2==0) {
				System.out.println("Even Number is: "+i);
			}
			else {
				System.out.println("Odd Number is: "+i);
			}
		}
	}

}
