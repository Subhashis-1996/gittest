package logic.deb.w3resource.string;

import java.util.HashMap;
import java.util.Map;

public class Str43MaxOccChar {

	public static void main(String[] args) {
		String str="java program";
		String str1=str.replaceAll("\\s", "");
		char[] ch=str1.toCharArray();
		Map<Character, Integer> chMap=new HashMap<Character, Integer>();
		for(char c:ch) {
			if(chMap.containsKey(c) && c!=' ') {
				chMap.put(c, chMap.get(c)+1);
			}else {
				chMap.put(c, 1);
			}
		}
		System.out.println(chMap);
		System.out.println(chMap.keySet());
		maxOccur(chMap);

	}
	static void maxOccur(Map<Character, Integer> map) {
		int c = 0;
		char ch=' ';
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			//System.out.println(entry.getValue());
			int a=entry.getValue();
			if(c>a) {
				c=c;
				//System.out.println(c);
			}else {
				c=a;
			}
			if(entry.getValue()==c) {
				 ch=entry.getKey();
			}
		}
		System.out.println(ch);
		
	}

}
