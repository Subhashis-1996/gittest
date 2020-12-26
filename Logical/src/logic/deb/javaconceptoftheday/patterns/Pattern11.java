/*
     1
    121
   12321
  1234321
 123454321
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern11 {

	public static void main(String[] args) {
		int row=5,count1=0;
		for(int i=0;i<row;i++){
			int count=1;
			for(int j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print(count);
				count++;
			}
			for(int l=count1;l>0;l--) {
				System.out.print(l);
			}
			count1++;
			System.out.println();
		}

	}

}
