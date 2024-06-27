package com.example.BasicProgramJava;

import java.util.Scanner;

public class practise {
	public static void main(String[] args) 
	{
		int n=123;
		int temp=n;
		int rem;
		int sum=0;
		int count=0;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
