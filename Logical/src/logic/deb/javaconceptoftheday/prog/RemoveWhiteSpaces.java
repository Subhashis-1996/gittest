package logic.deb.javaconceptoftheday.prog;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		/*
		String str="Remove All The White Spaces From This String ! ! !";
		String strRem=str.replaceAll("\\s", ""); //or String strRem=str.replaceAll(" ", ""); or String strRem=str.replace(" ", "");
		System.out.println(strRem);
		*/
		
		//without using any predefined methods
		Scanner sc=new Scanner(System.in);
		System.out.print("String with spaces  :");
		String str=sc.nextLine();
		char[] chArr=str.toCharArray();
		String str1="";
		for (int i = 0; i < chArr.length; i++) {
			if((chArr[i]!=' ') && (chArr[i]!='\t')) {
				str1=str1+str.charAt(i);
			}
		}
		System.out.println("String with spaces  :"+str);
		System.out.println("String without spaces :"+str1);
	}
}