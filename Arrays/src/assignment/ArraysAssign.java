package assignment;

public class ArraysAssign {

	public static void main(String[] args) {
		int num[] = {12,23,1,43,65,45,90,87,65,32,45,11,22,54,34};
		
		//Reversing the Array
		
		for (int i = 0; i < num.length/2; i++) {
			int temp = num[i];
			num[i] = num[num.length - i - 1];
			num[num.length - i - 1] = temp;
			System.out.println(+num[i]);
		}
		
		int num1[] = new int[20];
		num1[0] = 50;
		num1[1] = 12;
		num1[2] = 43;
		num1[3] = 53;
		num1[4] = 76;
		num1[5] = 98;
		num1[6] = 32;
		num1[7] = 98;
		num1[8] = 50;
		num1[9] = 20;
		num1[10] = 21;
		num1[11] = 50;
		num1[12] = 60;
		num1[13] = 32;
		num1[14] = 87;
        int n =15;	
		
		//Deletion of element in num
		int del = 2;
		for (int i = del-1; i < n; i++) {
			num1[i]=num1[i+1];
		}
		n--;
		System.out.println("Printing num1 after deletion ");
		for (int i = 0; i < n; i++) {
			System.out.println(num1[i]);
		}
		

	}

}
