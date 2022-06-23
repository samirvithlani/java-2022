package com.oops.polymorephisam.overload;

public class Zomato {

	public void search(String foodName) {
		System.out.println("searchc called with "+foodName);
	}
	public void search(String foodName,String area) {
		System.out.println("searchc called with "+foodName+" in  "+area);
	}
	public void search(String foodName,int price) {
		System.out.println("searchc called with "+foodName+"price "+price);
	}
	public void search(int price) {
		System.out.println("searchc called with int "+price);
	}
	public void search(long price) {
		System.out.println("searchc called with long "+price);
	}
	public void search(double disc) {
		System.out.println("searchc called with double "+disc);
	}
	public void search(float disc) {
		System.out.println("searchc called with float "+disc);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Zomato z = new Zomato();
		z.search(15000000000l);
		z.search(15.25f);
		
	}
	
	
}
