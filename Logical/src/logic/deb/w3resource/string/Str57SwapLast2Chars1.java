package logic.deb.w3resource.string;

public class Str57SwapLast2Chars1 {

	public static void main(String[] args) {
		String str="debasish";
		char[] ch=str.toCharArray();
		
		char temp=ch[ch.length-2];
		ch[ch.length-2]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		System.out.println(ch);
		System.out.println(str.substring(0, str.length() ));

	}

}
