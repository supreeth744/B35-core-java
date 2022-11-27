package org.tnsindia.encapsulationdemo;

import org.tnsindia.accessspecifierdemo.PublicDemo;

public class HDFCExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAmount(84760);
		System.out.println("The amount is: "+h.getAmount());
		PublicDemo p=new PublicDemo();
		p.print(4376.98);

	}

}