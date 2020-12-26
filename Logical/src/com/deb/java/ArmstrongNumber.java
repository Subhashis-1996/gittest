package com.deb.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		int temp1=num,temp2=num,count=0,res=1,arm=0;
		while(temp1>0) {
			if(temp1%10>=0) {
				count++;
			}
			temp1=temp1/10;
		}
		while(temp2>0) {
			int count1=count;
			res=1;
			while(count1>0) {
				res=res*(temp2%10);
				count1--;
			}
			arm=arm+res;
			temp2=temp2/10;
		}
		if(num==arm) {
			System.out.println(num+" is an Armstrong Number");
		}else {
			System.out.println(num+" is not an Armstrong Number");
		}

	}
}