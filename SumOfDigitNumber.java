package com.example.allnumberbaseprogram;

public class SumOfDigitNumber {

	public static void main(String[] args) 
	{
		int n=1234;
		int temp;
		int sum=0;
		
		while(n>0) {
			temp=n%10;
			sum=sum+temp;
			n/=10;
		}
		System.out.println("The sum of digti Number is: "+sum);
	}

}
