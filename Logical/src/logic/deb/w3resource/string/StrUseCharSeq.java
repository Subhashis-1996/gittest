package logic.deb.w3resource.string;

public class StrUseCharSeq {

	public static void main(String[] args) {
		char[] chArr=new char[] {'a','s','u','b','h','a','b'};
		String str=String.copyValueOf(chArr, 1, 5);
		String str1=String.copyValueOf(chArr);
		System.out.println("my name is "+str);
		System.out.println(str1);
	}

}
