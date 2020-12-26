package logic.deb.InnerClassConcept;

public class NestedClassTest{
	 public static void main(String[] args) {
		OuterClass.NestedClass outerNestedClass= new OuterClass.NestedClass();
		outerNestedClass.display();
		OuterClass outerClass=new OuterClass();
		System.out.println(outerClass.b);
	}
}

 class OuterClass {
	
	static int a=10;
	int b=20;
	private static int c=30;
	
	static class NestedClass{
		public void display() {
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
		}
	}

}
 
 
