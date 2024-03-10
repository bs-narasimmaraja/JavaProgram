package com.jsp.numberprograms;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num1=n;
		int num=n;
		int count=0;
		
		int sum=0;
		while(n>0) {
			n/=10;
			count++;
	}System.out.println(count);
		while(num>0) {
			int rev=num%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul=mul*rev;
			}
			sum+=mul;
			num/=10;
	}System.out.println(sum);
		
		if(num1==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
		
		
		}
	
	

}
