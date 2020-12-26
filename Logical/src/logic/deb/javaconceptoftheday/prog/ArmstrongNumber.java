package logic.deb.javaconceptoftheday.prog;

public class ArmstrongNumber {

	public static void main(String[] args) {
		checkArmstrong(153);
		checkArmstrong(371);
		checkArmstrong(407);
		checkArmstrong(535);
		checkArmstrong(9474);
		checkArmstrong(54748);
		checkArmstrong(4297);

	}
	public static void checkArmstrong(int number) {
		int num=number;
		int numDigits=String.valueOf(num).length();//String.valueOf(obj) method converts given variable into string and length() is used to count size
		int sum=0;
		
		while(num !=0) {
			int lastDigit=num%10;
			int numPower=1;
			for(int i=0;i<numDigits;i++) {
				numPower=numPower*lastDigit;
			}
			sum=sum+numPower;
			num=num/10;
		}
		if(sum==number) {
			System.out.println(number+" is an Armstrong Number");
		}else {
			System.out.println(number+" is not an Armstrong Number");
		}
	}

}
