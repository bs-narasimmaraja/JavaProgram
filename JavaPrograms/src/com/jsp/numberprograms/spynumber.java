package com.jsp.numberprograms;

import java.util.Scanner;

public class spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		int mul=1;
		while(n>0) {
			int rev=n%10;
			sum+=rev;
			mul*=rev;
			n/=10;
		}System.out.println(sum);
		System.out.println(mul);
		if(sum==mul) {
			System.out.println("spy number");
		}
		else {
			System.out.println("not a spy number");
		}
	}

}
