package com.jsp.numberprograms;

import java.util.Scanner;

public class pallindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0) {
			int rev=n%10;
			sum=(sum*10)+rev;
			n/=10;
		}System.out.println(sum);
		if(sum==num) {
			System.out.println("pallindrome ");
		}else {
			System.out.println("not a pallindrome");
		}
	}

}
