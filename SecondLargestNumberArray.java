package com.example.ArraysManipulation;

import java.util.Arrays;

public class SecondLargestNumberArray {
	static int secondLargestNumber(int[]a,int total) {
		Arrays.sort(a);
		return a[total-2];
	}

	public static void main(String[] args) 
	{
		int[]a=new int[] {1,2,3,4,5,6};
		System.out.println(secondLargestNumber(a, 6));
	}

}
