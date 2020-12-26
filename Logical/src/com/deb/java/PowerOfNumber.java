package com.deb.java;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();sc.nextLine();
		System.out.print("Enter Power:");
		int pow=sc.nextInt();
		int res=1;
		while(pow!=0) {
			res=res*num;
			pow--;
		}
		System.out.println(res);

	}

}
