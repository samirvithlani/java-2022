package com.ch1;

/*
 * method is nothing but function
 * method = behaviour
 * use method : reusablity of code...
 * 				2 types of methods 
 * 
 * pre deffine method				      user define method
 *    nextInt....							user will create that method..
 *    
 *    		static method and non static methods
 *    
 *    1) with return type with args
 *    2)with return type without args
 *    3)without r type without args
 *    4)without r type with args
 * 
 * 	
 * */
public class MethodDemo1 {

	// method will create inside class only in java...
	// but one method can be called in side other method but can not create inside
	// other method...

	// signature of method will cover return type,method name,param of
	// method..,access specifer..
	// non static method :
	// copoy = object count..
	public void demo1() {

		System.out.println("without return type without args...");
	}

	public int sum(int a, int b) {

		System.out.println("with args with return type");
		int c = a + b;
		return c;

	}

	public String upper() {

		return "XYZ";
	}

	public static void main(String[] args) {

		// all non static method can be called by object of class only...
		// how to create an object of class in java ??

		MethodDemo1 m1 = new MethodDemo1();
		m1.demo1();
		int a = 1, b = 2;
		// a ,b scanner
		int x = m1.sum(a, b);
		System.out.println(x);

		System.out.println(m1.sum(150, 250));
		System.out.println(m1.upper());

	}

}
