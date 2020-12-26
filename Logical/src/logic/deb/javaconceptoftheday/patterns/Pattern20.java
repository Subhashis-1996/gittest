/*
    *
   ***
  *****
 *******
*********
less code
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern20 {

	public static void main(String[] args) {
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=i;j<row-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
