package com.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		// array is group of similar kind of ddata...
		// primtive non primitive

		// int float,doublt,short,long,boolean...
		// -->no methods
		// np string,array,udf objects
		// methods..
		// int a[] = { 12, 22, 55, 78, 96 };
		int a[] = new int[6];
//		a[0] = 150;
//		a[1] = 50;
//		a[2] = 550;
//		a[3] = 450;
//		a[4] = 111;
//		a[5] = 112;
//	
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("pls enter "+(i+1)+"  element");
			a[i] = sc.nextInt();
		}

		//foreach loop
		
		for(int x:a) {
			System.out.println(x);
		}
		
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		int len = a.length;
		System.out.println(len);

	}
}
