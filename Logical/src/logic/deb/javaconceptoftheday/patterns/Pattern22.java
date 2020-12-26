/*
*********
 *******
  *****
   ***
    *
 less code
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern22 {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>0;i--) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
