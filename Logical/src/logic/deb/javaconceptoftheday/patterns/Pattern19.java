/*
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		int row=10;
		for(int i=0;i<row-5;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=i;k<row-5;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=row-5;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
