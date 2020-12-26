package logic.deb.javaconceptoftheday.prog;

public class SumOfDigits {
	 int summ=0;

	public static void main(String[] args) {
		findSum(153);
		findSum(546);
		findSum(897);
		findSum(786);
		
		System.out.println("<---Using Recursive--->");
		SumOfDigits sumOfDigits=new SumOfDigits();
		System.out.println(sumOfDigits.findRecusiveSum(1536758));
	}
	public static void findSum(int number) {
		int num=number;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits of "+number+" is "+sum);
	}
	
	//Using Recursive method
	public int findRecusiveSum(int input) {
		if(input==0) {
			return 0;
		}
		else {
			int rem=input%10;
		    summ=summ+rem;
			input=input/10;
			findRecusiveSum(input);
			
		}
		return summ;
	}

}
