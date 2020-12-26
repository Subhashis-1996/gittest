/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern24 {

	public static void main(String[] args) {
		int row=9;
		for(int i=0;i<row-4;i++) {
			for(int j=i;j<row-5;j++) {
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
		for(int i=row-5;i>0;i--) {
			for(int j=row-5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2-1;k++) {
				if(k>0 && k<i*2-2) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
