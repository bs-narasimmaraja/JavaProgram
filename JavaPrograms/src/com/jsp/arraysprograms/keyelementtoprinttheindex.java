package com.jsp.arraysprograms;

public class keyelementtoprinttheindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		int key=3;
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				index=i;
			}
		}System.out.println(index);
	}

}
