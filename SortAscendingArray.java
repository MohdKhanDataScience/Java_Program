package com.example.ArraysManipulation;

public class SortAscendingArray {

	public static void main(String[] args) 
	{
		int a[]=new int[] {2,5,4,3,6,1};
		int temp;
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorting An Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
