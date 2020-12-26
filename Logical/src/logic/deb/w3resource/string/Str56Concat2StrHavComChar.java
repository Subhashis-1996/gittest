package logic.deb.w3resource.string;

public class Str56Concat2StrHavComChar {

	public static void main(String[] args) {
		String str="food";
		String str1="day";
		System.out.println("concat 2 strings "+str+" and "+str1);
		System.out.println(concatinate(str,str1));

	}
	static String concatinate(String str, String str1) {
		if(str.length()!=0 && str1.length()!=0 && str.charAt(str.length()-1)==str1.charAt(0)) {
			return str+str1.substring(1);
		}
		return str+str1;
	}

}
