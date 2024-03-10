package com.jsp.arraysprograms;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,2,4,3,5,3,2};
		sort(a,0,a.length-1);
		
	}

	public static void sort(int[] a, int st, int end) {
		// TODO Auto-generated method stub
		if(st>=end) 
		return;
		int i=st;
		int j=end;
		if(i<=j) {
			int pivot=(st+end)/2;
			while(a[i]<a[pivot]) 
				i++;
			while(a[j]>a[pivot])
				j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			i++;
			j--;
			sort(a,st,j);
			sort(a,i,end);
		}
	}

}
