package logic.deb.w3resource.string;

public class Str45RevWordOfString {

	public static void main(String[] args) {
		String str="java program";
		String[] stArr=str.split(" ");
		String str1="";
		for(int i=0;i<stArr.length;i++) {
			String s=stArr[i];
			String str3="";
			for(int j=s.length()-1;j>=0;j--) {
				str3+=s.charAt(j);
			}
			str1+=str3+" ";
		}
		System.out.println(str1);

	}

}
