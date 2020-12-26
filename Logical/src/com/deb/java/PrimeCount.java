package com.deb.java;

import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Range:");
		int num=sc.nextInt();
		int counter=0;
		for(int i=1;i<=num;i++) {
		if(isPrime(i)) {
			counter++;
		}
	}
		System.out.println("number of prime is "+counter);
	}
	public static boolean isPrime(int a) {
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}

}
