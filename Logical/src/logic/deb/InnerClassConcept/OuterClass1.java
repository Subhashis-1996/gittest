package logic.deb.InnerClassConcept;

public class OuterClass1 {
	
	private int getValue(int data) {
		class InnerClass1{
			public int getData() {
				if(data<10) {
					return 10;
				}else {
					return 15;
				}
			}
		}
		InnerClass1 innerClass=new InnerClass1();
		System.out.println("in InnerClass");
		return innerClass.getData();
	}
	public static void main(String[] args) {
		OuterClass1 outerClass=new OuterClass1();
		System.out.println("data="+outerClass.getValue(10));
	}

}
