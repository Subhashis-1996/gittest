package logic.deb.w3resource.string;

public class Str51CntDupChars {

	public static void main(String[] args) {
		String str="subhashis";
		System.out.println("dup char list: ");
		showDuplicates(str);

	}
	static void showDuplicates(String str) {
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				System.out.printf("%c repeates %d times\n",i,arr[i]);
			}
		}
	}

}
