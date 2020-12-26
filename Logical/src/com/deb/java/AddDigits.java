package com.deb.java;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int rem,sum=0,num1=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
         System.out.println(num1+"="+sum);
	}

}
