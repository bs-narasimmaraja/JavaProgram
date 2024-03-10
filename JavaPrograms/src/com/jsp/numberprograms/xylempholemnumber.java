package com.jsp.numberprograms;

import java.util.Scanner;

public class xylempholemnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int count=0;
		int sum=0;
		int sum1=0;
		while(n>0) {
			count++;
			n/=10;
		}
		for(int i=1;i<=count;i++) {
			int rev=num%10;
			num/=10;
			if(i==1 || i==count) {
			sum+=rev;	
			}
			else {
				sum1+=rev;
			}
		}
		
		System.out.println(sum);
		System.out.println(sum1);
		if(sum==sum1) {
			System.out.println("xylem number");
		}
		else {
			System.out.println("pholem number");
		}
		
	}

}
