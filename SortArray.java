package com.example.ArraysManipulation;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) 
	{
		int[]a=new int[] {1,3,2,6,5,3,4,7};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
