package logic.deb.w3resource.string;

public class Str52ChkRotString {

	public static void main(String[] args) {
		String str="ABACD";
		String str1="CDABA";
		ckhRotnStr(str,str1);

	}
	static void ckhRotnStr(String str, String str1) {
		if(str.length()==str1.length() && (str+str1).indexOf(str1)!=-1) {
			System.out.println();
		}
	}

}
