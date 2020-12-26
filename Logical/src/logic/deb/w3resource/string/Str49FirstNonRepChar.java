package logic.deb.w3resource.string;

import java.util.ArrayList;
import java.util.List;

public class Str49FirstNonRepChar {

	public static void main(String[] args) {
		String str="godisgood";
		boolean[] boo=new boolean[256];
		List<Character> chList=new ArrayList<Character>();
		System.out.println("the given string:"+str);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			System.out.println("Reading char:"+ch);
			if(!boo[ch]) {
				if(!(chList.contains(ch))) {
					chList.add((Character)ch);
				}else {
					chList.remove((Character)ch);
					boo[ch]=true;
				}
			}
			if(chList.size()!=0) {
				System.out.println("the first non repeat char is: "+chList.get(0));
			}
		}

	}

}
