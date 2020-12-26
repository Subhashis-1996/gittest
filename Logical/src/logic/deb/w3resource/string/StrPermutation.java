package logic.deb.w3resource.string;

public class StrPermutation {

	public static void main(String[] args) {
		permWithRep("xy");
	}
	static void permWithRep(String str) {
		System.out.println("the permutations of:"+str);
		getPerm(str,"");
	}
	static void getPerm(String str, String str1) {
		if(str1.length()==str.length()) {
			System.out.println(str1);
			return;
		}
		for(int i=0;i<str.length();i++) {
			getPerm(str, str1+str.charAt(i));
		}
	}

}
