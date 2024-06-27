package com.example.BasicProgramJava;

public class PrimeUsingMethod {
	
	public static void main(String[] args) {
		primeNumber(11);
		primeNumber(10);
	}
	
	static void primeNumber(int n){
		int i=10,temp=0;
		
		for( i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp+=1;
			}
		}
		if(temp==0) {
			System.out.println(n+" is a prime Number");
		}
		else {
			System.out.println(n+" is not Prime NUmber");
		}
	}

}
