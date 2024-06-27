package com.example.allnumberbaseprogram;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%10==0) {
			System.out.println("Duck");
		}
		else {
			System.out.println("Not Duck");
		}
	}

}
