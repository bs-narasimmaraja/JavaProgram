package com.jsp.numberprograms;

import java.util.Scanner;

public class snakepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int k=(n*i)-(n-1);
				for(int j=1;j<=num;j++) {
					System.out.print(k +" \t ");
					k++;
				}
			}else {
				int f=(n*i);
				for(int j=1;j<=num;j++) {
					System.out.print(f+" \t");
					f--;
				}
			}System.out.println();
		}
	}

}
