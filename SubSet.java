package com.example.StringManipulation;

public class SubSet {

	public static void main(String[] args)
	{
		String str="FUN";
		int len=str.length();
		int temp=0;
		
		String[]ar1=new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				ar1[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}

	}

}
