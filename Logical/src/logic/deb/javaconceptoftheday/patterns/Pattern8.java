/*
     *
    ***
   *****
  *******
 *********
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern8 {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print("*");
			}
			for(int l=row;l>=i+1;l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
