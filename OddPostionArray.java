package com.example.ArraysManipulation;

public class OddPostionArray {

	public static void main(String[] args)
	{
		int [] a=new int[] {1,2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i=i+2) {
			System.out.println(a[i]+" ");
		}
		System.out.println("Other way");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
