package com.example.BasicProgramJava;

import java.util.Scanner;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int countEven=0;
		int countOdd=0;
		
		for(int i=m;i<=n;i++) {
			if(i%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		System.out.println("Total Even Number is: "+countEven);
		System.out.println("Total Odd Number is: "+countOdd);
	}

}
