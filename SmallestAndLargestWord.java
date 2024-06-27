package com.example.StringManipulation;

public class SmallestAndLargestWord {

	public static void main(String[] args) 
	{
		String s="Java programming using to developed Software in IT Industry";
		String[]word=s.split("\\s+");
		
		String smallest=word[0];
		String largest=word[0];
		
		for(String words:word) {
			if(words.length()>largest.length()) {
				largest=words;
			}
			
			if(words.length()<smallest.length()) {
				smallest=words;
			}
		}
		
		System.out.println("Largest word is: "+largest);
		System.out.println("Smallest word is: "+smallest);

	}

}
