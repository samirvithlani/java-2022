package com.array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter eleemts");
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print("  "+a[i][j]);
				
			}
			System.out.println();
		}
		// i ==0 0 0 1 0 2
		// 1 0 1 1 1 2
		// 2 0 2 2 2 2

		// 7 days 2 time wether report 7 * 2
		// 0 0 0 0 1
		// 1 1 0 1 1

	}
}
