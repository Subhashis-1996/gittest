/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
*/
package logic.deb.javaconceptoftheday.patterns;

public class Pattern7 {

	public static void main(String[] args) {
		int row=5,count=1;
		for(int i=0;i<row;i++) {
			for(int j=count;j>=1;j--) {
				System.out.print(j+" ");
			}
			count++;
			System.out.println();
		}

	}

}
