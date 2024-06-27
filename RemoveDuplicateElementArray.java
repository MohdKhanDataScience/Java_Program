package com.example.ArraysManipulation;

import java.util.HashSet;

public class RemoveDuplicateElementArray 
{

	public static void main(String[] args)
	{
		int[]a=new int[] {1,2,3,4,2,3,5};
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int no:hs) {
			System.out.print(no+" ");
		}
		
	}

}
