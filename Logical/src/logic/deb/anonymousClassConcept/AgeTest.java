package logic.deb.anonymousClassConcept;

/*
interface Age{
	int age=25;
	public int getAge();
}

class MyAge implements Age{

	@Override
	public int getAge() {
		
		return age;
	}
	
}

public class AgeTest {
	
	public static void main(String[] args) {
		MyAge myAge=new MyAge();
		System.out.println("age="+myAge.getAge());
	}
	
	

}
*/

interface Age{
	int age=25;
	int getAge();
}

public class AgeTest{
	public static void main(String[] args) {
		Age age=new Age() {
			
			@Override
			public int getAge() {
				
				return age;
			}
		};
		System.out.println("age="+age.getAge());
	}
}