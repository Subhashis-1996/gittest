package logic.deb.w3resource.string;

import java.util.ArrayList;
import java.util.List;

public class Str42CkhStr {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("rabbit");
		list.add("bribe");
		list.add("bibel");
		list.add("god");
		for(String str:list) {
			checkStrings(str,"bib");
		}

	}
	static void checkStrings(String str, String str1) {
		int count=0;
		char ch=' ';
		int[] arr=new int[256];
		for(int i=0;i<str1.length();i++) {
			ch=str1.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(arr[ch]>=1) {
				count=1;
			}
		}
			if(count==1) {
				System.out.println(str);
			}
	}

}
