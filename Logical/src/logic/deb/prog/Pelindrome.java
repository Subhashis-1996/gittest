package logic.deb.prog;

public class Pelindrome {

	public static void main(String[] args) {
		for(int i=0;i<=150;i++) {
			int x=i;
			int sum=0;
			while(x>0) {
				int r=x%10;
				sum=sum*10+r;
				x=x/10;
			}
			if(sum==i) {
				System.out.println(i+" is a Pelindrome");
			}
		}

	}

}
