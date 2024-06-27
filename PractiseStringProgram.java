package com.example.StringManipulation;

public class PractiseStringProgram {

	public static void main(String[] args) 
	{
		String s="Java is a ";
		String[]word=s.split("\\s+");
		
		StringBuilder reverse=new StringBuilder();
		for(int i=word.length-1;i>=0;i--) {
			reverse.append(word[i]).append(" ");
		}
		System.out.println(reverse);
	}

}
