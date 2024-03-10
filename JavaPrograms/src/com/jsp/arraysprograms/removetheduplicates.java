package com.jsp.arraysprograms;

public class removetheduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,1,2,3,4,5,4,3};
		int n=remove(a);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

	public static int remove(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length-1;
		int newsize=n;
		for(int i=0;i<newsize;i++) {
			for(int j=i+1;j<newsize;j++) {
				if(a[i]==a[j]) {
					for(int k=j;k<newsize-1;k++) {
						a[k]=a[k+1];
					}
					newsize--;
					j--;
				}
			}
		}
		return newsize;
	}

}
