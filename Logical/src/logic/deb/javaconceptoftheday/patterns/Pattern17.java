/*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern17 {

	public static void main(String[] args) {
		int row=9;
		for(int i=0;i<row-4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-5;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}