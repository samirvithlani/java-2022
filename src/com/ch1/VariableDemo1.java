package com.ch1;

public class VariableDemo1 {

	// instance variable - class level variable..
	// non static
	int x = 100;
	// static instace variable..
	static int y = 200;

	public void demo() {

		// non static instance varibale can be called in non static method
		System.out.println(x);
		// static instance varibale can be called in non static method
		System.out.println(y);
	}

	public static void main(String[] args) {
		//you can not called non static iinstance variable in static method..
		// compilation error..
		// System.out.println(x);

		//// static instance varbile can be called in static method without object or
		//// class name....
		System.out.println(y);

		VariableDemo1 v1 = new VariableDemo1();
		v1.demo();
	}
}
