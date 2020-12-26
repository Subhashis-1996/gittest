/*
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int row=5;
		int count=1;
		for(int i=row;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print(count+" ");
			}
			System.out.println();
			count++;
			
		}

	}

}
