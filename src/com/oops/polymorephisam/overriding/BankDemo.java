package com.oops.polymorephisam.overriding;

class RBI{
	
	public void withdraw() {
		System.out.println("RBI METHOD CALLED...");
	}
}
class SBI extends RBI{
	
	public void withdraw() {
		System.out.println("SBI METHOD CALLED...");
	}
}

public class BankDemo {

	
	public static void main(String[] args) {
		
		SBI s = new SBI();
		s.withdraw();
		
		
	}
}
