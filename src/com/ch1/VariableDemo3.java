package com.ch1;

public class VariableDemo3 {

	//final instance non static
	//final instance variable must be initilized..
	final int y=25;
	void demo1() {
		final int p =250;
		System.out.println(p);
		//The final field VariableDemo3.y cannot be re assigned
		//y=250;
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		
		
	}
}
