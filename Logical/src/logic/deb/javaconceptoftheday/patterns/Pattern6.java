/*
     1
    121
   12321
  1234321
 123454321
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int row=5,count1=1;
		for(int i=row;i>0;i--) {
			int count=1;
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print(count);
				count++;
			}
			for(int l=count1-1;l>=1;l--) {
				System.out.print(l);
				
			}
			count1++;
			System.out.println();
		}

	}

}
