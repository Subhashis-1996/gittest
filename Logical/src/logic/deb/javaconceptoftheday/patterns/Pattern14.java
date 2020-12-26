/*
12345
2345
345
45
5
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern14 {

	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=i;j<=row;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
