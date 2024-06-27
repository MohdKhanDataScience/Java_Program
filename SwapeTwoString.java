package com.example.StringManipulation;

public class SwapeTwoString {

	public static void main(String[] args) 
	{
		String s1="Good",s2="Morning";
		s1=s1+s2;
		
		s2=s1.substring(0,(s1.length()-s2.length()));
		System.out.println(s2);
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping are:"+s1+" "+s2);

	}

}
