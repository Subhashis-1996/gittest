/*
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>0;i--) {
			int count=1;
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
