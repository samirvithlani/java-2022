package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		// arithmatic exception
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("please enter no1:");
			int no1 = sc.nextInt();

			System.out.println("please enter no2:");
			int no2 = sc.nextInt();

			int c = no1 / no2;
			System.out.println("ans =>" + c);
		} catch (ArithmeticException e) {

			System.out.println("Can not Divide by zero..." + e.getMessage());

		} catch (InputMismatchException e) {

			System.out.println("please check your input..");
		} catch (Exception e) {

			System.out.println("server down...");
		}

	}
}
