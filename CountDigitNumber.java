package com.example.allnumberbaseprogram;

public class CountDigitNumber {

	public static void main(String[] args) {
		
		int n=0007234;
		int count=0;
		while(n!=0) 
		{
			n/=10;
			//n=n/10;
			++count;
		}
		System.out.println("Total Number of digit is: "+count);
	}

}