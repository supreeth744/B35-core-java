package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class bitwisedemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of a and b:");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(8>>1);
		System.out.println(8<<1);
		s.close();
	}

	}


