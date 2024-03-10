package com.jsp.arraysprograms;

public class maxoccuranceingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,2,3,3,4,3,4};
		int maxcount=0;
		int maxoccur=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				if(count>maxcount) {
					maxcount=count;
					maxoccur=a[i];
				}
			}
		}System.out.println(maxoccur);
	}

}
