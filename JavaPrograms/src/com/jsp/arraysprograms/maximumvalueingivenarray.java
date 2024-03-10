package com.jsp.arraysprograms;

public class maximumvalueingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,8,5,6,7};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println(max);
	}

}
