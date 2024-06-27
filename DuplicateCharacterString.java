package com.example.StringManipulation;

public class DuplicateCharacterString 
{

	public static void main(String[] args) 
	{
		String str="Javaisa";
		int count=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate charater are : "+ ch[j]);
					count++;
					
				}
				
			}
			
		}
		
		System.out.println(count);

	}

}
