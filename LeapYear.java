package com.example.BasicProgramJava;

public class LeapYear {

	public static void main(String[] args) {
		
		int leap=2017;
		
		if(leap%4==0) {
			
			if(leap%100==0) {
				System.out.println("Not Leap Year");
				if(leap%400==0) {
					System.out.println("Leap Year");					
				}
				else {
					System.out.println("Not Leap year");
				}
			}
			else {
				System.out.println("Leap Year");
				
			}
		}
		else {
			System.out.println("Not Leap Year");
		}

	}

}
