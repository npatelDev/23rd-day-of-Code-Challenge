package com.SecondPractice.Advance;

public class EqualityOfArrayElements {
		public static void main(String[] args) {
			int[] num=new int[] {2,4,9,8,4,6,3,2,4,6};
			for(int i=0;i<num.length;i++) {
				for(int j=i+1;j<num.length;j++) {
					if(num[i] == num[j]) {
						System.out.println(num[j]);
					}
				}
			}
		}
}
