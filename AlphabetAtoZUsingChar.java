package com.example.BasicProgramJava;

import java.util.Scanner;

public class AlphabetAtoZUsingChar {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		for(c='a';c<='z';c++) {
			System.out.print(c+" ");
		}
	}

}
