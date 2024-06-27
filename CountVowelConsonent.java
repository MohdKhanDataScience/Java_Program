package com.example.StringManipulation;

public class CountVowelConsonent {

	public static void main(String[] args) 
	{
		String str="Java is a Programming Language";
		int cCount=0,vCount=0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				cCount++;
			}
		}
		
		System.out.println("Number of Vowels is: "+vCount);
		System.out.println("Number of Consonent is: "+cCount);
			

	}

}
