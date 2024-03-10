package com.jsp.arraysprograms;

import java.util.Arrays;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,2,1,4,5,7,5};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println(Arrays.toString(a));
	}

}
