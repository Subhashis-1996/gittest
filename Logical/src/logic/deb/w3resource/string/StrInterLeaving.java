package logic.deb.w3resource.string;

public class StrInterLeaving {

	public static void main(String[] args) {
		String str="AC";
		String str1="DBE";
		String str2="ABCDE";
		
		System.out.println("Interleaving or not: "+checkInterleav(str,str1,str2));

	}
	static boolean checkInterleav(String str, String str1, String str2) {
		if(str.length()+str1.length() > str2.length()) {
			return false;
		}
		int i=0, j=0, k=0;
		while(k<str2.length()) {
			if(i<str.length() && str.charAt(i)==str2.charAt(k)) {
				i++;
			}else if(j<str1.charAt(j) && str1.charAt(j)==str2.charAt(k)) {
				j++;
			}else {
				return false;
			}
			k++;
		}
		if(!(i==str.length() && j==str1.length() && k==str2.length())) {
			return false;
		}
		
		return true;
	}

}
