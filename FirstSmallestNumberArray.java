package com.example.ArraysManipulation;

import java.util.Arrays;

public class FirstSmallestNumberArray {
	static int firstSmallestNumber(int[]a,int total) {
		Arrays.sort(a);
		return a[0];
	}

	public static void main(String[] args)
	{
		int[]a=new int[] {1,2,3,4,5,6};

		System.out.println(firstSmallestNumber(a, 6));
	}

}
