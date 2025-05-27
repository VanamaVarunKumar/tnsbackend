package com.arrays.concept.examples;

import java.util.Arrays;

public class ArraysClassMethods {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {3,5,1,4,2};
		int c[]= {1,2,3,4,5};
		//Prints all the elements like for loop
		System.out.println(Arrays.toString(a));
		//Compares elements in both arrays index wise then returns
		 //-1->If element of an 1st array is less than element in 2nd array in any index.
		 //0-> If all the elements are same and also in same order.
		 //1->If element of an 1st array is greater than element in 2nd array in any index.
		System.out.println(Arrays.compare(b, c));
		//Copies the original array into a new array with the specified length.
		int copyb []=Arrays.copyOf(a, 8);
		System.out.println(Arrays.toString(copyb));
		//Checks if two arrays are equal (same elements and same order).
		System.out.println(Arrays.equals(a,c));
		//Fills the array with a specific value.
		Arrays.fill(a, 2,4, 1);;
		System.out.println(Arrays.toString(a));
		//Sorts array
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
	}

}
