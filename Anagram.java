package com.example.StringManipulation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1="Grab";
		String s2="Brag";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Both String are not anagram");
		}
		else {
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
		
		if(Arrays.equals(str1,str2)==true) {
			System.out.println("Both the String are Anagram");
			
		}
		else {
			System.out.println("Both string are not Anagram");
		}
		}
	}

}
