package com.example.BasicProgramJava;

import java.util.Scanner;

public class primeNumber1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber:");
		int n=sc.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp+=1;
			}
		}
		if(temp==0) {
			System.out.println(n+ " is a prime");
		}
		else {
			System.out.println(n+ " is not a prime");
		}

	}

}
