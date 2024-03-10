package com.jsp.arraysprograms;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		int key=2;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println(i);
			}
		}
	}

}
