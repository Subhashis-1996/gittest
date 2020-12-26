package logic.deb.prog;

public class FirstAndLastOccuranceInAnIntArray {

	public static void main(String[] args) {
	   
	    int[] arr={2,4,5,7,7,9,12};
	    int x=5;
	    int first=firstOccurance(arr,x);
	    int last=lastOccurance(arr,x);
	    if(first==last) {
	    	last=-1;
	    }
	    System.out.println("{"+first+","+last+"}");
	}
	
	public static int firstOccurance(int[] arr, int x) {
		int p=0,r=arr.length-1;
		while(p<=r) {
			int q=(p+r)/2;
			
			if(arr[q]==x) {
				if(q-1>=0 && arr[q-1]==x) {
					r=q-1;
					continue;
				}
				return q;
			}
			else if(arr[q]>x) {
				r=q-1;
			}
			else {
				p=q+1;
			}
		}
		return -1;
	}
	
	public static int lastOccurance(int[] arr, int x) {
		int p=0,r=arr.length-1;
		while(p<=r) {
			int q=(p+r)/2;
			if(arr[q]==x) {
				if(q+1<=arr.length-1 && arr[q+1]==x) {
					p=q+1;
					continue;
				}
				return q;
			}
			else if(arr[q]>x) {
				r=q-1;
			}
			else {
				p=q+1;
			}
		}
		return -1;
	}

}
