package com.example.ArraysManipulation;

import java.util.Arrays;

public class ThirdLargestNumberArray {
	static int ThirdLargestNumber(int[]a,int total) {
		Arrays.sort(a);
		return a[total-3];
	}

	public static void main(String[] args)
	{
		int []a=new int [] {1,2,4,3,6,5};
		System.out.println(ThirdLargestNumber(a,6));
		
	}

}
