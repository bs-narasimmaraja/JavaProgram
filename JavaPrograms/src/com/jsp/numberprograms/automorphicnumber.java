package com.jsp.numberprograms;

import java.util.Scanner;

public class automorphicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num1=n;
		int num=n;
		int i=1;
		while(n>0) {
			i*=10;
			n/=10;
		}
		int squr=num*num;
		System.out.println(squr);
		
		if((squr%i)==num1) {
			System.out.println("automorphic number");
		}
		else {
			System.out.println("not a automorphic number");
		}
		
	}

}
