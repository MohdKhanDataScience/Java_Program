package com.example.ArraysManipulation;

public class RightRotateArray {

	public static void main(String[] args)
	{
		int a[]=new int [] {1,2,3,4,5};
		int last;
		int n=2;
		for(int i=0;i<n;i++) {
			last=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
