package com.deb.java;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i+1);k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
