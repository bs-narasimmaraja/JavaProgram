package com.jsp.arraysprograms;

import java.util.Arrays;

public class mergingtwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,0};
		int[]c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<a.length;j++) {
			c[j]=b[j];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
