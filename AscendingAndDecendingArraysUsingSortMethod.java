package com.example.ArraysManipulation;

import java.util.Arrays;

public class AscendingAndDecendingArraysUsingSortMethod {

	public static void main(String[] args)
	{
		int[]a=new int[] {1,2,3,4,6,5,3};
		Arrays.sort(a);
		System.out.println("Ascending Order Arrays:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Dcending Order Array");

		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
