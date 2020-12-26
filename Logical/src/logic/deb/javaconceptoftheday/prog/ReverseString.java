package logic.deb.javaconceptoftheday.prog;

public class ReverseString {

	public static void main(String[] args) {
		revStr("Hello java");
	}
	public static void revStr(String str) {
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}

}
