package com.example.BasicProgramJava;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		if(n>0) {
			System.out.println("Positive Number is: "+n);
		}
		else if(n<0)
		{
			System.out.println("Negative Number is: "+n);
		}
		else {
			System.out.println("Both are qual");
		
		}
	}

}
