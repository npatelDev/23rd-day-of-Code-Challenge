package com.SecondPractice.Advance;

import java.util.Arrays;

public class EqualityOfTwoArray {
	public static void main(String[] args) {
		
		int[] num1=new int[] {1,2,4,4,6,7,3};
		int[] num2=new int[] {1,2,4,7,3};
		boolean status=Arrays.equals(num1,num2);
			if(status == true) {
				System.out.println("Arrays are Same");
			}else {
				System.out.println("Arrays are not Same");
			}
		
	}
	
}
