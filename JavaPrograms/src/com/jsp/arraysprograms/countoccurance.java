package com.jsp.arraysprograms;

import java.util.Scanner;

public class countoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int count=0;
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}System.out.println("--------");
		System.out.println("enter the key you want to count");
		int key=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				count++;
			}
		}System.out.println(count);
	}
}
