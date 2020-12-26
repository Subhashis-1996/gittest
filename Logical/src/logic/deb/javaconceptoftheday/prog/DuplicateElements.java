package logic.deb.javaconceptoftheday.prog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] inputArray=new int[] {11,33,55,33,66,22,88,99,55,11,77};
		System.out.println("<----Using Brute Force---->");
		findDuplicateBruteForce(inputArray);
		System.out.println("<----Using Sorting---->");
		findDuplicateSort(inputArray);
		System.out.println("<----Using HashSet---->");
		findDuplicateHashSet(inputArray);
		System.out.println("<----Using HashMap---->");
		findDuplicateHashMap(inputArray);

	}
	//Using Brute Force
	public static void findDuplicateBruteForce(int[] inputArray) {
		for(int i=0;i<inputArray.length;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[i]==inputArray[j]) {
					System.out.println("Duplicate Element is: "+inputArray[i]);
				}
			}
		}
	}
	
	//Using Sorting
	public static void findDuplicateSort(int[] inputArray) {
		Arrays.sort(inputArray);
		for(int i=0;i<inputArray.length-1;i++) {
			if(inputArray[i]==inputArray[i+1]) {
				System.out.println("Duplicate Element: "+inputArray[i]);
			}
		}
	}
	
	//Using HashSet
	public static void findDuplicateHashSet(int[] inputArray) {
		HashSet<Integer> hSet=new HashSet<Integer>();
		for(int ele:inputArray) {
			if(!hSet.add(ele)) {
				System.out.println("Duplicate Element is:"+ele);
			}
			else {
				hSet.add(ele);
			}
		}
	}
	
	public static void findDuplicateHashMap(int[] inputArray) {
		HashMap<Integer, Integer> hMap=new HashMap<Integer, Integer>();
		for(int num:inputArray) {
			if(hMap.get(num)==null) {
				hMap.put(num, 1);
			}else {
				hMap.put(num, hMap.get(num)+1);
			}
		}
			Set<Entry<Integer,Integer>> entrySet=hMap.entrySet();
			for(Entry<Integer, Integer> entry:entrySet) {
				if(entry.getValue()>1) {
					System.out.println("Element "+entry.getKey()+" is present "+entry.getValue()+" times");
				}
			}
	}

}
