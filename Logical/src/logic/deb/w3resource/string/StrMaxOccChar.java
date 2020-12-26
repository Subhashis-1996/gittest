package logic.deb.w3resource.string;

public class StrMaxOccChar {

	public static void main(String[] args) {
		String str="successes";
		int[] freq=new int[str.length()];
		char maxChar=str.charAt(0);
		char minChar=str.charAt(0);
		int min,max;
		
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					freq[i]++;
					
				}
			}
		}
		min=max=freq[0];
		for(int i=0;i<freq.length;i++) {
			if(min>freq[i]) {
				min=freq[i];
				minChar=ch[i];
			}
			else if(max<freq[i]) {
				max=freq[i];
				maxChar=ch[i];
			}
		}
		System.out.println("max occ char: "+maxChar);
		System.out.println("min occ char: "+minChar);

	}
	
}
