package com.SecondPractice.Advance;
import java.util.Scanner;
public class FactorialNumber {
	static int f=1;
	static int fact(int n) {
		while(n!=0) {
			f=f*n--;
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number");
		int Fnum=input.nextInt();
		System.out.println("Factorial of a Number  :"+fact(Fnum));
		input.close();
	}
}
