package com.example.StringManipulation;

public class reverseString {

	public static void main(String[] args)
	{
		String str="Java";
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
