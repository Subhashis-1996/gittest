package logic.deb.inheritance;

class Parent{
	int x=10;
	
	public void m1() {
		System.out.println("in parent m1()");
	}


}

public class Child extends Parent{
	int x=20;
	
	public void m1() {
		System.out.println("in child m1()");
	}
	
	public static void main(String[] args) {
		Parent parent=new Child();
		Child child=new Child();
		System.out.println(parent.x);
		System.out.println(child.x);
		parent.m1();
		child.m1();
		
	}

}
