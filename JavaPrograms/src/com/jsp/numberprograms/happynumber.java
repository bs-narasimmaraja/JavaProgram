package com.jsp.numberprograms;

import java.util.Scanner;

public class happynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int m=n;
		while(m!=1 && m!=4) {
			m=ishappy(m);
		}
		if(m==1) {
			System.out.println("happy number");
		}
		else {
			System.out.println("not a happy number");
		}
	}

	public static int ishappy(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n>0) {
			int rev=n%10;
			int squr=rev*rev;
			sum+=squr;
			n/=10;
		}
		return sum;
	}

}
