package logic.deb.javaconceptoftheday.prog;

import java.util.HashMap;
import java.util.Set;

public class CountDupCharOccurance {

	public static void main(String[] args) {
		countOccurance("Javaj2ee");
		countOccurance("Studious Student");
	}
	public static void countOccurance(String str) {
		String str1=str.toLowerCase();
		char[] chArr=str1.toCharArray();
		HashMap<Character, Integer> chMap=new HashMap<Character, Integer>();
		for(Character ch:chArr) {
			if(chMap.containsKey(ch)) {
				chMap.put(ch, chMap.get(ch)+1);
			}else {
				chMap.put(ch, 1);
			}
		}
		System.out.println("Occurance of duplicate character of string \""+str+"\" is");
		Set<Character> countChars=chMap.keySet();
		for(Character dupCount : countChars) {
			if(chMap.get(dupCount)>1) {
				System.out.println(dupCount+" : "+chMap.get(dupCount));
			}
		}
		System.out.println();
	}
}