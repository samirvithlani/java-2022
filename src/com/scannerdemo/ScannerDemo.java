package com.scannerdemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		int a = 10, b = 20;
		System.out.println("a = " + (a + b));
		
		//to take data from user create an object of scanner class
		//you need to import that class
		//java.lang no need to import..
		//java.util.Scanner
		Scanner sc = new Scanner(System.in);
		int x;
		float per;
		String name;
		System.out.println("pls enter your name");
		name = sc.nextLine();
		System.out.println("name = "+name);
		
		System.out.println("pls enter value of x");
		
		//to take input of int
		x = sc.nextInt();
		System.out.println("value of x = "+x);
		System.out.println("pls enter your per");
		per = sc.nextFloat();
		System.out.println("per = "+per);
		

	}
}
