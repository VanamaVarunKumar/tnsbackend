package com.arrays.concept.examples;

public class ArraysUserDefined {

	public static void main(String[] args) {
		//Array Declaration Type-1
		int arr1[]=new int[5];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		arr1[4]=5;
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int j:arr1)
		{
			System.out.print(j+" ");
		}
		System.out.println();
//-----------------------------------------------------------------------
      //Array Declaration Type-2
		int arr2[]= {6,7,8,9,10};
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int j:arr2)
		{
			System.out.print(j+" ");
		}
		System.out.println();
//-----------------------------------------------------------------------
	
		//Array Declaration Type-3
		
		int arr3[]= new int[]{11,12,13,14,15,16,17,18};
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		for(int j:arr3)
		{
			System.out.print(j+" ");
		}
	}

}
