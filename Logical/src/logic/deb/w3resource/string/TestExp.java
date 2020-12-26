package logic.deb.w3resource.string;

public class TestExp {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("in try");
			return 10/0;
		}
		catch (Exception e) {
			System.out.println("in catch");
			return 20/0;
		}
		finally {
			System.out.println("in finally");
			//return 30;
		}
		
	}

}
