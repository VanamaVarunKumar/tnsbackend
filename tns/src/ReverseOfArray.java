package com.tns.arrays;

public class ReverseOfArray {
	public static void main(String[] args) {
		int nums[]= {12,13,14,15,16,17};
		int count=0;
		//Reverse of a Array
		//int oddcount=nums.length-count;
		//for(int i=nums.length-1;i>=0;i--) {
//			System.out.println(nums[i]);
//			//System.out.println("j");
	//Count of even and odd
	for(int i:nums) {
		if(i%2==0) 
			count+=1;
	System.out.println("No of even numbers:"+count);
	System.out.println("No of odd numbers:"+ (nums.length-count));
}
}
}