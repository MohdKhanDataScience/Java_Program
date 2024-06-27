package com.example.ArraysManipulation;

import java.util.Arrays;

public class SecondSmallestNumberArray {
	static int secondLargestNumber(int[]a,int total) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args)
	{
		int[]a=new int[] {1,2,3,4,5,6};
		

		System.out.println(secondLargestNumber(a, 6));
	}

}
