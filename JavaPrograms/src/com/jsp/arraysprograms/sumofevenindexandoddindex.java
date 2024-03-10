package com.jsp.arraysprograms;

public class sumofevenindexandoddindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8};
		int sumeven=0;
		int sumodd=0;
		
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sumeven+=a[i];
			}else {
				sumodd+=a[i];
			}
		}System.out.println(sumeven);
		System.out.println(sumodd);
	
	
	}

}
