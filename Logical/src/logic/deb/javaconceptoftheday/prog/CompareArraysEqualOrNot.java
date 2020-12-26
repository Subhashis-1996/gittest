package logic.deb.javaconceptoftheday.prog;

import java.util.Arrays;

public class CompareArraysEqualOrNot {

	public static void main(String[] args) {
		//without any predefined methods
	/*	int[] a1= {3,4,1,3,5,6};
		int[] a2= {3,4,1,3,5,6};
		
		boolean isEqual=true;
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i] != a2[i]) {
					isEqual=false;
				}
			}
		}else {
			isEqual=false;
		}
		if(isEqual) {
			System.out.println("a1 and a2 are equal");
		}else {
			System.out.println("a1 and a2 are not equal");
		}     */
		
		//using Arrays.equals methods
		String[] s1={"corejava","advjava","spring","springboot"};
		String[] s2={"corejava","spring","springboot","advjava"};
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("s1 and s2 are equal");
		}else {
			System.out.println("s1 and s2 are not equal");
		}    
		
		//use Arrays.deepEquals when comparing multidimensional array
	/*	String[][] str1= {{"java","oracle","sun"},{".net","php","microsoft"}};
		String[][] str2= {{"java","oracle","sun"},{".net","php","microsoft"}};
		
		System.out.print("using Arrays.equals(): ");
		if(Arrays.equals(str1, str2)) {
			System.out.println("str1 and str2 are equal");
		}else {
			System.out.println("str1 and str2 are not equal");
		}
		
		System.out.print("using Arrays.deepEquals(): ");
		if(Arrays.deepEquals(str1, str2)) {
			System.out.println("str1 and str2 are equal");
		}else {
			System.out.println("str1 and str2 are not equal");
		}   */
	
	}

}
