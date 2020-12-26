package logic.deb.InnerClassConcept;

public class OuterForInner {
	
	
	
	private void getValue() {
		int num=10;
		
		class Inner{
			public int devisor;
			public int reminder;
			
			public Inner() {
				//num=50;
				devisor=5;
				reminder=num % devisor;
			}
			
			private int getDevisor() {
				return devisor;
			}
			
			private int getReminder() {
				return num % devisor;
			}
			
			private int getQuotient() {
				System.out.println("in Inner class");
				return num/devisor;
			}
		}
		Inner inner=new Inner();
		System.out.println("Devisor="+inner.getDevisor());
		System.out.println("Revinder="+inner.getReminder());
		System.out.println("Quotient="+inner.getQuotient());
		
	}
	
	public static void main(String[] args) {
		OuterForInner outerForInner=new OuterForInner();
		outerForInner.getValue();
	}

}
