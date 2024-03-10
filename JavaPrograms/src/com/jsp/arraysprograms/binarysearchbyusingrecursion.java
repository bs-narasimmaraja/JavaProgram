package com.jsp.arraysprograms;

public class binarysearchbyusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8};
		System.out.println(search(a,6,0,a.length-1));
	}

	public static int search(int[] a, int st, int end, int key) {
		// TODO Auto-generated method stub
		
		if(st>end)return-1;
		int mid=((st+end)/2);
		if(key==a[mid])return mid;
		else if(key<a[mid])search(a,st,key,mid-1);
		else search(a,key,mid+1,end);
		return -1;
	}

}
