package logic.deb.InnerClassConcept;


public class OuterA { 
	private void myMethod() { 
		class InnerA { 
			private void innerMethod() { 
				System.out.println("Inside inner class"); 
			} 
			
		}
		InnerA inner = new InnerA(); 
			inner.innerMethod(); 
		
	//	inner.myMethod();
	} 
	
	public static void main(String[] args) { 
		OuterA outer = new OuterA(); 
		outer.myMethod();
		
	} 
} 
