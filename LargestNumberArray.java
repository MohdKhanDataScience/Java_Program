package com.example.ArraysManipulation;

import java.util.Arrays;

public class LargestNumberArray {
	static int largestNumberArray(int[]a,int total) {
		Arrays.sort(a);
		return a[total-1];
	}

	public static void main(String[] args)
	{
		int[]a=new int[] {1,2,3,4,5,6};

		System.out.println(largestNumberArray(a, 6));
	}

}
