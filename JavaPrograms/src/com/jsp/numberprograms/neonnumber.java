package com.jsp.numberprograms;

import java.util.Scanner;

public class neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		int squr=n*n;
		while(squr>0) {
			int rev=squr%10;
			sum+=rev;
			squr/=10;
		}
		System.out.println(sum);
		if(num==sum) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not a neon number");
		}
		
	}

}
