package com.hanbit.sequence;

public class ArithmeticSequence {
	public static void main(String[] args) {
		int j = 0, i = 0, k = 0;
		System.out.print("구구단 \n");

		for (k = 1; k < 10; k++) {
			for (i = 2; i < 6; i++) {

				System.out.print(i + "*" + k + "=" + (i * k) + "\t");
			}
			System.out.print("\n");
		}

		System.out.print("\n");

		for (k = 1; k < 10; k++) {
			for (i = 6; i < 10; i++) {
				System.out.print(i + "*" + k + "=" + (i * k) + "\t");
			}
			System.out.print("\n");
		}
	}
}