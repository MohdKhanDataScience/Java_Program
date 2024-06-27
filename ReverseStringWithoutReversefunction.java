package com.example.StringManipulation;

public class ReverseStringWithoutReversefunction {

	public static void main(String[] args)
	{
		String str="Java is a programing";
		
		for(int i=str.length();i>0;--i) {
			System.out.print(str.charAt(i-1));
		}

	}

}
