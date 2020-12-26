package logic.deb.w3resource.string;

public class StrByteArr {

	public static void main(String[] args) {
		String str="Java Program";
		byte[] byteArr=str.getBytes();
		String str1=new String(byteArr);
		
		System.out.println(str1);

	}

}
