package org.tnsindia.operatorsdemo;
import java.util.*;
import java.util.Scanner;

public class logicaloperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of age and weight:");
		int age = s.nextInt();
		int weight = s.nextInt();
		boolean result1 = age>18&&(weight>50);
		boolean result2 = age>18&&(weight>50);
		
		System.out.println("the result is:" + result1);
		System.out.println("the result is:" + result2);
	}


	}


