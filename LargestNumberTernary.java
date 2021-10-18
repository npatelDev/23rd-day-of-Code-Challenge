package com.Tricky.ProgramesPractice;
import java.util.Scanner;
public class LargestNumberTernary {
	public static void main(String args[]){
		int a,b,c;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter First Number");
		a=input.nextInt();
		System.out.println("Enter Second Number");
		b=input.nextInt();
		System.out.println("Enter Third Number");
		c=input.nextInt();
		
		int Highest= c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Highest Number is :"+Highest);
		input.close();
	}
}
