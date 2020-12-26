package logic.deb.w3resource.string;

public class Str38RemoveDuplicate {

	public static void main(String[] args) {
		String str="subhashis";
		System.out.println("Before Removing Duplicate:"+str);
		System.out.println("After Removing Duplicate:"+remDuplicate(str,""));
	}
	static String remDuplicate(String str, String str1) {
		char[] ch=str.toCharArray();
		for(char ch1:ch) {
			if(str1.indexOf(ch1)==-1) {
				str1+=ch1;
			}
		}
		return str1;
	}

}
