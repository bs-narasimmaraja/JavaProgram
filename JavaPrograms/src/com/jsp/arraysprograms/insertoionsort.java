package com.jsp.arraysprograms;

import java.util.Arrays;

public class insertoionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,2,5,4,7,6};
		for(int i=0;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
				a[j+1]=key;
			}
		}System.out.println(Arrays.toString(a));
	}

}
