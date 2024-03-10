package com.jsp.arraysprograms;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,5,4,5,9,6,7,8};
		System.out.println(search(a,9));
	}

	public  static int search(int[] a, int key) {
		// TODO Auto-generated method stub
		int st=0;
		int end=a.length-1;
		while(st<=end) {
			int mid=((st+end)/2);
			if(key==a[mid]) 
				return mid;
			else if(key<a[mid]) 
				end=mid-1;
			else
				st=mid+1;
			
		}
		return -1;
	}

}
