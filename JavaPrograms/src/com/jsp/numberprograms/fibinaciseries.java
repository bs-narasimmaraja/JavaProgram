package com.jsp.numberprograms;

import java.util.Scanner;

public class fibinaciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System .in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int a=0;int b=1;int c;
		for(int i=0;i<=n;i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	
	
	}

}
