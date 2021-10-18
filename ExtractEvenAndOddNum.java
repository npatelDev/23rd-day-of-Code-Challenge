package com.SecondPractice.Advance;

public class ExtractEvenAndOddNum {
	public static void main(String[] args) {
		int[] num=new int[] {1,2,4,4,6,7,3};
		System.out.println("Even Array Elements");
		for(int arry:num) {
			if(arry%2 == 0) {
				System.out.println(arry);
			}
		}
		System.out.println("Odd Array Elements");
		for(int arry:num) {
			if(arry%2 != 0) {
				System.out.println(arry);
			}
		}
		}
		
	}
