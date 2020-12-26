package logic.deb.inheritance;

import java.util.Arrays;

public class AnagramProg {

	public static void main(String[] args) {
		System.out.println(SearchAnagram("army", "mary"));

	}
	public static boolean SearchAnagram(String s1, String s2){
	      char[] ch1=s1.toCharArray();
	      char[] ch2=s2.toCharArray();

	      Arrays.sort(ch1);
	      Arrays.sort(ch2);

	      Boolean b=Arrays.equals(ch1,ch2);
	      if(b){
	          return true;
	      }
	      else{
	          return false;
	      }

	}

}
