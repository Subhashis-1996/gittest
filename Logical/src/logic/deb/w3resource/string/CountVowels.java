package logic.deb.w3resource.string;

public class CountVowels {

	public static void main(String[] args) {
		String str="acknowledgement";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if('a'==str.charAt(i)||'e'==str.charAt(i)||'i'==str.charAt(i)
					||'o'==str.charAt(i)||'u'==str.charAt(i)) {
				count++;
			}
		}
		System.out.println("The no. of vowels in "+str+" are:"+count);

	}

}
