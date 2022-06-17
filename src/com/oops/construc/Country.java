package com.oops.construc;


public class Country {

	String cName;

	public Country(int code) {

		cName = "INDIA";
		System.out.println("default const called.." + code);

	}

	public static void main(String[] args) {

		// to call method we need to create object of class
		// and by using that object we cann call that Method.class.

		Country c1; // reference
		// new key word
		// Country()
		Country c = new Country(91);
		// c.demo();

	}
}
