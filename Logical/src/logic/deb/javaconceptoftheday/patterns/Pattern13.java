/*
     1
    212
   32123
  4321234
 543212345
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern13 {

	public static void main(String[] args) {
		int row=5,count=1;
		for(int i=row;i>0;i--) {
			int count1=2;
			for(int j=i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=count;k>0;k--) {
				System.out.print(k);
			}
			count++;
			for(int l=row;l>i;l--) {
				System.out.print(count1);
				count1++;
			}
			System.out.println();
		}

	}

}
