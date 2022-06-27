package com.array;

public class VarargsDemo1 {

	public void demo(int x) {
		System.out.println(x);
	}
	public void demo1(int x,int ...a) {
		
		System.out.println("x = "+x);
		for(int p:a) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		
		
		VarargsDemo1 v1 = new VarargsDemo1();
		v1.demo(5);
		v1.demo1(15,45,78);
	}
}
