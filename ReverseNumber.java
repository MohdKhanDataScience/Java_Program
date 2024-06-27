package com.example.allnumberbaseprogram;

public class ReverseNumber {

	public static void main(String[] args)
	{
		int n=12345678;
		int temp;
		
		while(n!=0)
		{
			temp=n%10;
			System.out.print(temp);
			n=n/10;
		}
		
	}

}
