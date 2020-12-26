package logic.deb.w3resource.string;

public class StrComp {

	public static void main(String[] args) {
		String str="my computer 1";
		String str1="my Computer 1";
		
		//int compare=str.compareTo(str1);
		int compare=str.compareToIgnoreCase(str1);
		
		if(compare>0) {
			System.out.println(str1+" comes before "+str);
		}else if(compare<0) {
			System.out.println(str+" comes before "+str1);
		}else {
			System.out.println(str+" and "+str1+" are equal");
		}

	}

}
