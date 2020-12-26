package com.deb.java;

import java.util.Scanner;

public class CountDidits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int  num=sc.nextInt();
		int count=0;
		while(num>0) {
			if(num%10>=0) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);

	}

}
