package assignment;

public class ArraysAssign2 {

	public static void main(String[] args) {
		int ar[]= {2,333,451,2,34,10,12,11,272,10,40,23,11,84,111,92,110};
		
		//...............Printing Even Numbers...........
		System.out.println("Even Numbers :");
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2 == 0) {
				System.out.print(ar[i]+" ");
			}
		}
		
		//...............Printing Odd Numbers...............
		System.out.println("\n\nOdd Numbers :");
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2 != 0) {
				System.out.print( ar[i]+" ");
			}
		}
	}
	
	
	}


