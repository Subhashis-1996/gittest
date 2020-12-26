/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern18 {

	public static void main(String[] args) {
		int row=9;
		for(int i=row-4;i>0;i--) {
			for(int j=i-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<=row-4;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<row-5;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=row-5;k>i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
 }

}
