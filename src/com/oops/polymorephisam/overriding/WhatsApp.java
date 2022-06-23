package com.oops.polymorephisam.overriding;

abstract class App {

	//100 % 50% 0%
	public abstract void msg();

	public void mms() {

	}
}

class Hike extends App{

	@Override
	public void msg() {
		
		System.out.println("mmsg from hike");
		
	}
	
	
}
public class WhatsApp extends App {

	public void msg() {

		System.out.println("whatsapp method called..");

	}

	public static void main(String[] args) {

		// runtime polymorephisam

		// App ap = new App();
		WhatsApp app = new WhatsApp();
		app.msg();

		// App a;//reference
		App a = new WhatsApp();
		App ab = new Hike();
		ab.msg();
		a.msg();

	}

}
