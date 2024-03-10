package com.jsp.arraysprograms;

public class secondhighestingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,7,5,6,8};
		int max1=0;
		int max2=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
		}System.out.println(max2);
		
	}

}
