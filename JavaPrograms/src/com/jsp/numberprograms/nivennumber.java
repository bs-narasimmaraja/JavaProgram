package com.jsp.numberprograms;

import java.util.Scanner;

public class nivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0) {
			int rev=n%10;
			sum+=rev;
			n/=10;
		}
		if(num%sum==0) {
			System.out.println("niven number");
		}else {
			System.out.println("not a niven number");
		}
		
		
	}

}
