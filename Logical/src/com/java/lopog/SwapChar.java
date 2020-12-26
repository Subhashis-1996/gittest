package com.java.lopog;

public class SwapChar {

	public static void main(String[] args) {
		String str="debasish";
		char[] ch=str.toCharArray();
		
			char temp=ch[0];
			ch[0]=ch[ch.length-1];
			ch[ch.length-1]=temp;
			System.out.println(ch);

	}

}
