package logic.deb.w3resource.string;

public class Str57SwapLast2Chars {

	public static void main(String[] args) {
		String str="debasish";
		char[] chArr=str.toCharArray();
		String str1="";
		for(int i=0;i<chArr.length;i++) {
			chArr[chArr.length-2]=str.charAt(str.length()-1);
			chArr[chArr.length-1]=str.charAt(str.length()-2);
			str1+=chArr[i];
			
		}
		System.out.println("given string:"+str);
		System.out.println("required string:"+str1);

	}

}
