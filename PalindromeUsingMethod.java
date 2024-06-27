package com.example.BasicProgramJava;

public class PalindromeUsingMethod {
	static int n=121;
	static int temp=n;
	static int rev=0,rem;
	
	public static void isPalindromeOrNot() {
		while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;	
		}
		if(rev==n) {
			System.out.println(n+" is Palindrome");
		}
		else {
			System.out.println(n+" is Not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		PalindromeUsingMethod p=new PalindromeUsingMethod();
		p.isPalindromeOrNot();

	}
	

}
