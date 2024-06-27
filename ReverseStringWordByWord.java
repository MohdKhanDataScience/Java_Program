package com.example.StringManipulation;

public class ReverseStringWordByWord {

	public static void main(String[] args) 
	{
		String s="Java is a Programming";
		
		String[]word=s.split("\\s+");
		
		StringBuilder rev=new StringBuilder();
		
		for(int i=word.length-1;i>=0;i--) {
			rev.append(word[i]).append(" ");
		}
		System.out.println(rev);

	}

}
