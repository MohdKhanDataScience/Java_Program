package com.example.ArraysManipulation;

public class PrintEvenPositionArray {

	public static void main(String[] args)
	{
		int [] a=new int [] {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}
		System.out.println("Other Way");
		
		for(int j=1;j<a.length;j=j+2) {
			System.out.print(a[j]+" ");
		}
	}

}
