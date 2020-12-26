/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern15 {

	public static void main(String[] args) {
		int row=9;
		for(int i=0;i<row-4;i++) {
			for(int j=i;j<row-4;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--) {
				System.out.print("*");
			}
			for(int l=i;l>0;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row-5;i>0;i--) {
			for(int j=row-4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			for(int l=0;l<i-1;l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
