package com.jsp.numberprograms;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}System.out.println(sum);
		if(sum==num) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
			
		}
	}

}
