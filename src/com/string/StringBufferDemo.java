package com.string;

//StirngBuffer -->mutable,class,datatype 
public class StringBufferDemo {

	public static void main(String[] args) {

		String s="java";
		StringBuffer sb = new StringBuffer(s);
		// System.out.println(sb);
		// sb.append("Hi");
		// sb.reverse();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.setCharAt(1, 'A');
		// sb.delete(0, 2);
		// sb.deleteCharAt(1);
		// sb.replace(0, 2, "#");

		System.out.println(sb);

	}
}
