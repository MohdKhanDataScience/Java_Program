package com.example.ArraysManipulation;

public class CountArray {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5};
		System.out.println(a.length);
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
		}
		System.out.println(count);

	}

}
