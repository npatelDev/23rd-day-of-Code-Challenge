package com.SecondPractice.Advance;

public class FindSumOfArray {
	public static void main(String[] args) {
		int sum=0;
		int[] num=new int[] {1,2,4,4,6,7,3};
		for(int arry:num) {
			sum=sum+arry;
		}System.out.println("Sum of Array Elements  :"+sum);
	}
}