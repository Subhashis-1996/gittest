/*
 123454321
  1234321
   12321
    121
     1
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern10 {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>0;i--) {
			int count=1;
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=count;k<=i;k++) {
				System.out.print(k);
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
