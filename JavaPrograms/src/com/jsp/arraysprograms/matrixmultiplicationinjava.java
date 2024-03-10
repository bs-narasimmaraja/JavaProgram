package com.jsp.arraysprograms;

public class matrixmultiplicationinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[][] b= {{1,2,2},
				{4,5,6},
				{1,2,3}};
		int[][] c=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i].length;k++) {
				c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				
			}
		}for(int[]n1:c) {
			for(int n2:n1) {
				System.out.print(n2+" \t ");
			}System.out.println();
		}
	}}

}
