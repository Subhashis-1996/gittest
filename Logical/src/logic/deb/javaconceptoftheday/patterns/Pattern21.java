/*
    *
   * *
  *   *
 *     *
*********
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern21 {

	public static void main(String[] args) {
		int row=5;
		for(int i=0;i<row-1;i++) {
			for(int j=row-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				if(k>0 && k<i*2) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=0;i<row*2-1;i++) {
			System.out.print("*");
		}

	}

}
