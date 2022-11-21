package org.tnsindia.decisionmakingdemo;
import java.util.scanner;
import java.util.*;

public class cascadedifelsedemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater"+b);

		}
		else
		{
			System.out.println("C is greater"+c);
		}
	}

}
