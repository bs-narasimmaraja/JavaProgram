package com.jsp.numberprograms;

import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		
		while(n>0) {
			int rev=n%10;
			int fact=1;
			for(int i=1;i<=rev;i++) {
				fact=fact*i;
			}
			sum+=fact;
			n/=10;
		}System.out.println(sum);
		if(sum==num) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not a Strong number");
		}
		
	}

}
