package com.ch1;

public class MethodDemo2 {

	// static method's copy will gen only 1
	public static void demo1() {

		System.out.println("wo a wo r staic");
	}

	public static String lower(String name) {

		return name.toLowerCase();
	}

	public static void main(String[] args) {

//		MethodDemo2 m2 = new MethodDemo2();
//		m2.demo1();

		MethodDemo2.demo1();
		System.out.println(MethodDemo2.lower("RAJ"));

	}
}
