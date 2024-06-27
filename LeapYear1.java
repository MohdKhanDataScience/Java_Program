package com.example.BasicProgramJava;

public class LeapYear1 {

	public static void main(String[] args) {
		
		int leap=1999;
		if((leap%400==0)||(leap%100!=0 && leap%4==0))
		{
			System.out.println("Leap Year");
			
		}
		else {
			System.out.println("Not Leap Year");
		}
	}

}
