package com.oops.inheritance;

class Bank {

	// instance variable...
	float intRate;

	void transaction() {

		System.out.println("trancation called..");
	}
}

//parent child
public class SBI extends Bank {

	public static void main(String[] args) {

		SBI s = new SBI();
		s.intRate = 10.25f;
		s.transaction();

	}
}
