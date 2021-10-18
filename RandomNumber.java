package com.SecondPractice.Advance;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumber {
		public static void main(String[] args) {
	//Approach one
			Random ranNum=new Random();
			int rand=ranNum.nextInt(10);
			System.out.println(rand);
	
			double rand1=ranNum.nextDouble();
			System.out.println(rand1);
	//Approach Two
			System.out.println(Math.random()*5);
			
	//Approach Three
	//Appache commons-lang API
	String Number= RandomStringUtils.randomNumeric(15);
	System.out.println(Number);
	
	//String Random 
	String str= RandomStringUtils.randomAlphabetic(5);
	System.out.println(str);
			
}
}