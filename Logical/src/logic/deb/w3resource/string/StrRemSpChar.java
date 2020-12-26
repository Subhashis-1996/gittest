package logic.deb.w3resource.string;

public class StrRemSpChar {

	public static void main(String[] args) {
		String str="subhashispanda996@gmail.com";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='@') {
				str1+=str.charAt(i);
			}
			
		}
		System.out.println("The Given String is:"+str);
		System.out.println("The New String is:"+str1);

	}

}
