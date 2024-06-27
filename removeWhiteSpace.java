package com.example.StringManipulation;

public class removeWhiteSpace {

	public static void main(String[] args)
	{
		String str="Java is a Programming Language";
		str=str.replaceAll("\\s","");
		
		System.out.println(str);

	}

}
