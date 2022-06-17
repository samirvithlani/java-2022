package com.oops.inheritance;

class Fashion {

	String s = "summer";
}

class Brand extends Fashion {

	void getBrand() {
		System.out.println(s);
	}
}

public class Store extends Brand {

	void getStore() {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		Store s = new Store();
		s.getStore();
		s.getBrand();
		
	}
}
