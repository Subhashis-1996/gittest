package com.deb.java;

public class Pattern8 {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n+4 ;k>(i*2);k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
