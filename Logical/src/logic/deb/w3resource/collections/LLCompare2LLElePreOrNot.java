package logic.deb.w3resource.collections;

import java.util.LinkedList;

public class LLCompare2LLElePreOrNot {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("red");
		llist.add("blue");
		llist.add("green");
		llist.add("yellow");
		llist.add("safron");
		llist.add("black");
		
		LinkedList<String> llist1=new LinkedList<String>();
		llist1.add("red");
		llist1.add("green");
		llist1.add("yellow");
		llist1.add("black");
		
		for(String str:llist) {
			if(!llist1.contains(str)) {
				System.out.println(str+" is not present in llist1");
			}
		}
	}

}
