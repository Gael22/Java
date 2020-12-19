package assignment;
import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int myAr[] = {11,23,43,546,87,980,-12,-54,654,324,23,-98,657,32};
		System.out.println("Contents of myAr : ");
		System.out.println(Arrays.toString(myAr));
		Arrays.sort(myAr);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(myAr));
		
		int myAr1[]=Arrays.copyOf(myAr, myAr.length+10);
		System.out.println("myAr1 = "+Arrays.toString(myAr1));
		System.out.println("myAr = "+Arrays.toString(myAr));
		
		int myAr2[]=new int[10];
		Arrays.fill(myAr2, 50);
		
		System.out.println("myAr2 = "+Arrays.toString(myAr2));
		
		System.out.println(Arrays.binarySearch(myAr, 980));
		System.out.println(Arrays.binarySearch(myAr, 11));
		System.out.println(Arrays.binarySearch(myAr, 24));
		

	}

}
