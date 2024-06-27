package com.example.ArraysManipulation;

public class SumOfItemArray {

	public static void main(String[] args)
	{
		int a[]=new int [] {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);

	}

}
