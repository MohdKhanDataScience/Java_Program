package com.example.BasicProgramJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,m=0,flag=0;
		int n=sc.nextInt();
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" Not a prime");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" Not a prime");
					flag=1;
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println(n+" is a prime");
		}
	}

}
