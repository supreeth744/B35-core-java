package org.tnsindia.datavariable;

import java.util.Scanner;

public class stringdemo {

	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("enter the number:");
	    int x = s.nextInt();
	    
	    System.out.println("enter the no:");
	    float y=s.nextFloat();
	    
	    System.out.println("enter the char:");
	    char c=s.next().charAt(0);
	    
	    System.out.println("enter the str:");
	    String str=s.next();
	    
	    System.out.println("the output is :"+str);
	    System.out.println("the output is :"+x);
	    System.out.println("the output is :"+y);
	    System.out.println("the output is :"+c);
	    s.close();
	    
	   
	}

}
