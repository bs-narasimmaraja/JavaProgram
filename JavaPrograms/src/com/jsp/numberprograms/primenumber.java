package com.jsp.numberprograms;

import java.util.Scanner;

public class primenumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	if(n<=1) {
		System.out.println("not a prime number");
	}return;
	boolean flag= true;
	for(int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.println("not a prime number");
				flag=false;
				break;
			}
		
	if(flag)
	{
		System.out.println("prime number");
	}
	}
	
}
}
