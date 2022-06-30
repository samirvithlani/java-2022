package com.string;

public class StringDemo1 {

	public static void main(String[] args) {

		// premitive int ,float,double,long,boolean
		// non prem array string,uDF
		// Mutablity :- > modfication can be done
		// immutablity :-> modfication can not be done >String s1 = "java";
		// string constant pool
		// s1 ="java"
		// s2="java"

		String s1 = "   java";
		// String s2 = new String("java");
		// System.out.println(s1);

		// s1 = s1.concat(" -jsp ");
		System.out.println(s1);
		boolean f = s1.contains("J");
		if (f == true) {
			System.out.println("contains....");
		} else {

		}
		System.out.println(f);
		System.out.println(s1.contains("j"));
		System.out.println(s1.length());

		s1 = s1.trim();
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.compareTo("java"));

		System.out.println(s1.equals("java"));

		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));

		s1 = s1.toUpperCase();
		System.out.println(s1);
		s1 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s1.isEmpty());

		System.out.println(s1.charAt(1));

		// s1 = s1.substring(2);
		// s1 = s1.substring(0, 2);
		System.out.println("start" + s1.startsWith("x"));
		System.out.println("end" + s1.endsWith("a"));
		System.out.println(s1);

		char c[] = s1.toCharArray();
		System.out.println("c-->" + c);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

//		String msg = "Hello Good,Morning all";
//		
//		String ar[] = msg.split("");
//		for(int i=0;i<ar.length;i++) {
//			
//			System.out.println(ar[i]);
//		}

	}
}
