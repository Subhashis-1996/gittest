package logic.deb.w3resource.string;

public class Str44RevString {

	public static void main(String[] args) {
		String str="java program";
		char[] ch=str.toCharArray();
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=ch[i];
		}
		System.out.println(str1);
	}

}
