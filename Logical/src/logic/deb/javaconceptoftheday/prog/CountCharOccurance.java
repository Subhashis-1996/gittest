package logic.deb.javaconceptoftheday.prog;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharOccurance {

	public static void main(String[] args) {
		charOccurance("JAVA J2EE JSP java j2ee jsp");
		

	}
	public static void charOccurance(String str) {

		char[] useStr=str.replaceAll("\\s+", "").toLowerCase().toCharArray();
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		for(char ch:useStr) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
			System.out.println("Occurance of each character of "+str+" is: ");
			Set<Entry<Character, Integer>> entrySet=charMap.entrySet();
			for(Entry<Character, Integer> entry:entrySet) {
				System.out.println(entry.getKey()+" is found "+entry.getValue()+" times");
			}
	}

}
