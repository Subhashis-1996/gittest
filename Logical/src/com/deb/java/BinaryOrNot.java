package com.deb.java;

import java.util.Scanner;

public class BinaryOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		int n=num;
		int a=0,b=0;
		while(n>0) {
			if(n%10==0 || n%10==1) {
				b++;
			}
			a++;
			n=n/10;
		}
		if(b==a) {
			System.out.println(num+" is a binary number");
		}else {
			System.out.println(num+" is not a binary number");
		}

	}

}
