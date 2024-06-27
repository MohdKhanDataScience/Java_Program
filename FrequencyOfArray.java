package com.example.ArraysManipulation;

public class FrequencyOfArray {

	public static void main(String[] args)
	{
		int[] a=new int []{1,2,3,5,2,3,4};
		int[] b=new int[a.length];
		int count=1;
		int visit=-1;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					b[j]=visit;
				}
			}
			if(b[i]!=visit) {
				b[i]=count;
			}
		}
		
		for(int i=0;i<b.length;i++) {
			if(b[i]!=visit) {
				System.out.println(a[i]+" "+b[i]+" ");
			}
		}

	}

}
