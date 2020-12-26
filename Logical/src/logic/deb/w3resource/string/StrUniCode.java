package logic.deb.w3resource.string;

public class StrUniCode {

	public static void main(String[] args) {
		String str="subhashis";
		System.out.println("Original String = "+str);
		System.out.println("Character(unicode point) = "+str.codePointAt(0));
		System.out.println("Character(unicode point) = "+str.codePointAt(7));
		System.out.println("Character(unicode point) before index = "+str.codePointBefore(6));
		System.out.println("Character(unicode point) = "+str.codePointCount(1, 9));

	}

}
