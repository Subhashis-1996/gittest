/*
     5
    454
   34543
  2345432
 123454321
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern12 {

	public static void main(String[] args) {
		int row=5,count=row;
		for(int i=row;i>0;i--) {
			int count1=row-1;
			for(int j=i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=count;k<=row;k++) {
				System.out.print(k);
			}
			count--;
			for(int l=count1;l>=i;l--) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
