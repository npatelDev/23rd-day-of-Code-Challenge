package com.Tricky.ProgramesPractice;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String args[]){
		int a,b,c;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter First Number");
		a=input.nextInt();
		System.out.println("Enter Second Number");
		b=input.nextInt();
		System.out.println("Enter Third Number");
		c=input.nextInt();
		
		if(a>b && a>c){
			System.out.println("Largest Number is "+a);
		}
		else if(b>a && b>c){
			System.out.println("Largest Number is "+b);
		}
		else{
			System.out.println("Largest Number is "+c);
		}
		input.close();
	}
}
