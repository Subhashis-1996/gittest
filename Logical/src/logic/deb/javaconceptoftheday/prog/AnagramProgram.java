package logic.deb.javaconceptoftheday.prog;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		checkAnagram("Mother In Law", "Hitler Woman");
		checkAnagram("Mother", "Hitler Woman");
		checkAnagram("keEp", "peeK");
        checkAnagram("SiLeNt CAT", "LisTen AcT");
        checkAnagram("Debit Card", "Bad Credit");
        checkAnagram("School MASTER", "The ClassROOM");
        checkAnagram("DORMITORY", "Dirty Room");
        checkAnagram("ASTRONOMERS", "NO MORE STARS");
        checkAnagram("Toss", "Shot");
        checkAnagram("joy", "enjoy");

	}
	
	public static void checkAnagram(String input1, String input2) {
		//Remove white spaces
		String str1=input1.replaceAll("\\s+", "");
		String str2=input2.replaceAll("\\s+", "");
		//covert all strings to lower case
		String strlow1=str1.toLowerCase();
		String strlow2=str2.toLowerCase();
		//convert strings to char[]
		char[] chArr1=strlow1.toCharArray();
		char[] chArr2=strlow2.toCharArray();
		//sort all the characters
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		
		//compare to char[] using Arrays.equals()
		if(Arrays.equals(chArr1, chArr2)) {
			System.out.println(input1+" and "+input2+" both are same(Anagram)");
		}else {
			System.out.println(input1+" and "+input2+" both are not same(Not Anagram)");
		}
	}

}
