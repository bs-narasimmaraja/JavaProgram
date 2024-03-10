package com.jsp.arraysprograms;

public class occuranceofeachelementingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,2,4,4,2,1,5,2};
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=0;
				}
				
			}if(a[i]!=0) {
				System.out.println(a[i]+" = "+count);
			}
		}
	}

}
