package com.jsp.arraysprograms;

import java.util.Arrays;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,8,5,4,5,4,6,5};
		for(int i=0;i<a.length;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
				if(i!=index) {
					int temp=a[i];
					a[i]=a[index];
					a[index]=temp;
				}
			}
		}System.out.println(Arrays.toString(a));
	}

}
