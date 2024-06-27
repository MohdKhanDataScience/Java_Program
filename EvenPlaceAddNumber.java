package com.example.allnumberbaseprogram;

public class EvenPlaceAddNumber {

	public static void main(String[] args) 
	{
		int n=123456;
		int temp;
		int sum=0;
		int count=0;
		
		while(n>0) {
			temp=n%10;
			count++;
			if(count%2==1) {
				sum+=temp;
			}
			n/=10;
		}
		System.out.println(sum);

	}

}
