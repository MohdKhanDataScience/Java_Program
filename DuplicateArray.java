package com.example.ArraysManipulation;

public class DuplicateArray {

	public static void main(String[] args) 
	{
		int [] a=new int[] {1,2,3,2,4,3,5,6,4,3};
		
		System.out.println("Duplicate Array");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
				}
			}
		}

	}

}
