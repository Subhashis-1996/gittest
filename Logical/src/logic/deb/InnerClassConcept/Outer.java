package logic.deb.InnerClassConcept;

import logic.deb.prog.Main;

public class Outer {
	public int data=10;
	
	public int getData() {
		return data;
	}
	
	public static void main(String[] args) {
		Outer outer=new Outer();
		if(outer.getData()<20) {
			class Inner{
				public int getValue() {
					System.out.println("in Inner class");
					return outer.data;
				}
				
			}
		Inner inner=new Inner();
		System.out.println("data="+inner.getValue());
		}else {
			System.out.println("in Outer class");
			
		}
	}

}
