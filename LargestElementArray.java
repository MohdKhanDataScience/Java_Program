package com.example.ArraysManipulation;

public class LargestElementArray {

	public static void main(String[] args) 
	{
		int [] a=new int [] {1,2,3,54,6,8,32};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);

	}

}
