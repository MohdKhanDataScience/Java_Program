package com.example.ArraysManipulation;

public class ReverseArray {

	public static void main(String[] args)
	{
		int [] a= new int [] {1,2,3,4,5};
		System.out.println("Original Array");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
		System.out.println("Reverse an array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}

}
