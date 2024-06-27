package com.example.StringManipulation;

public class DuplicateWordString {

	public static void main(String[] args)
	{
		String s="Java is a Code and is a programming";
		
		s=s.toLowerCase();
		int count;
		
		String[]word=s.split(" ");
		for(int i=0;i<word.length;i++) {
			count=1;
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="0";
			}
		}
			if(count>1 && word[i]!="0") {
				System.out.println(word[i]);
			}
		}
		

	}

}
