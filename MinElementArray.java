package com.example.ArraysManipulation;

public class MinElementArray {

	public static void main(String[] args) 
	{
		int a[]=new int [] {1,2,3,4,5,76,43,-1};
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
