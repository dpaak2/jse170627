package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("First Number: ");
		int a = s.nextInt();
		System.out.print("Second Number: ");
		int b = s.nextInt();
		int c = a / b;
		System.out.print("result: " + c);
	}
}