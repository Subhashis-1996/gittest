package logic.deb.javaconceptoftheday.prog;

public class SecondLargestNum {

	public static void main(String[] args) {
		System.out.println(findSecondLargest(new int[] {24,12,98,67,54,67,87}));

	}
	public static int findSecondLargest(int[] arr) {
		int firstLargest;
		int secondLargest;
		if(arr[0]>arr[1]) {
			firstLargest=arr[0];
			secondLargest=arr[1];
		}else {
			firstLargest=arr[1];
			secondLargest=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			else if(arr[i]<firstLargest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}

}
