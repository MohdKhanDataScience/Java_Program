package com.example.allnumberbaseprogram;

public class DigitProductNumber {

	public static void main(String[] args) {
		
		int n=12345;
		int temp;
		int product=1;
		while(n>0) {
			temp=n%10;
			product=product*temp;
			n/=10;
		}
		System.out.println("The Product of digit Number isd: "+product);

	}

}
