package logic.deb.w3resource.string;

import java.util.Arrays;

public class Str48RemMatchedStr {

	public static void main(String[] args) {
		String str="subhashis";
		remMatchedChars(str, "b", "sh");

	}
	static void remMatchedChars(String str, String str1, String str2) {
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='b') {
				continue;
			}else if(i+1<str.length() && ch[i]=='s' && ch[i+1]=='h') {
				i++;
			}else {
				ch[count++]=ch[i];
			}
		}
		char[] c=Arrays.copyOfRange(ch, 0, count);
		System.out.println(new String(c));
	}

}
