package com.example.ArraysManipulation;

public class LeftRotateArray {

	public static void main(String[] args) 
	{
		int [] a=new int [] {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int first=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=first;
		System.out.println("Left Rotate Array");
		
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}

	}

}
