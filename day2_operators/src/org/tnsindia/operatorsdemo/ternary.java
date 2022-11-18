package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of a and b:");
		int a = s.nextInt();
		int b = s.nextInt();
		String result1 = (a>b)?"true":"false";
	
		
		System.out.println("the result is:" + result1);
		
	}

	}


