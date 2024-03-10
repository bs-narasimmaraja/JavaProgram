package com.jsp.arraysprograms;

import java.util.Arrays;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,8,6};
		int[] b= {1,3,5};
		int[] c=new int[a.length+b.length];
		merge(a,b,c);
		System.out.println(Arrays.toString(c));
		}

	public static void merge(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
	}
		while(i<a.length) 
			c[k++]=a[i++];
		while(j<b.length)
			c[k++]=b[j++];
	}
}
