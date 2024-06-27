package com.example.allnumberbaseprogram;

public class SPYNumber {

	public static void main(String[] args) {
		
		int n=123;
		int temp;
		int sum=0;
		int product=1;
		
		while(n>0) {
			
			temp=n%10;
			sum=sum+temp;
			product=product*temp;
			
			n/=10;
		}
		if(sum==product) {
			System.out.println("Number is SPY Number");
		}
		else {
			System.out.println("Number is not a SPY  Number");
		}
	
	}

}
