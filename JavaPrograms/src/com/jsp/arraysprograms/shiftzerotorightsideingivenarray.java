package com.jsp.arraysprograms;

import java.util.Arrays;

public class shiftzerotorightsideingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,0,2,0,0,5,0,4};
		int[] b=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[k]=a[i];
				k++;
			}
			
		}System.out.println(Arrays.toString(b));
	}

}
