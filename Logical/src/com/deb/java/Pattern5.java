package com.deb.java;

public class Pattern5 {

	public static void main(String[] args) {
		int n=3,l=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
				for(int k=1;k<(i*2);k++) {
					System.out.print(" "+l);
					l++;
				}
				System.out.println();
		}

	}

}
