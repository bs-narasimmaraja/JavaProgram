package com.jsp.arraysprograms;

import java.util.Arrays;
import java.util.Scanner;

public class reverseelementingivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("-------------");
		for(int i=size-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
