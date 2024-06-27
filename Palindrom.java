package com.example.BasicProgramJava;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int temp=n;
		int rev=0,rem;
		
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(rev==n) {
			System.out.println(n+" is Palindrome Number");
		}
		else {
			System.out.println(n+" is not Palindrom Number");
		}
		
	}

}
