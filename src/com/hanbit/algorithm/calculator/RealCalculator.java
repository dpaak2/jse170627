package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class RealCalculator {
	public static void main(String[]args){
		Scanner s= new Scanner(System.in);
		System.out.println("first number: ");
		int a = s.nextInt();
		System.out.println("second number: ");
		int b=s.nextInt();
		int c=0;
		System.out.println("operation code: ");
		String op=s.next();
		
		switch (op) {
		case "+":
			c= a+b;
			System.out.println("result: "+c);
			break;
		case "-":
			c=a-b;
			System.out.println("result: "+c);
			break;
		case"/":
			c=a/b;
			System.out.println("result: "+c);
			break;
		case "*":
			c=a*b;
			System.out.println("result: "+c);
			break;
		}
	}
}