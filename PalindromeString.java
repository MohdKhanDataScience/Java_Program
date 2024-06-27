package com.example.StringManipulation;

public class PalindromeString {

	public static void main(String[] args)
	{
		String str="Madam";
		str=str.toUpperCase();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not Palindrome String");
		}

	}

}
