package com.hanbit.sequence;

public class WhileLoopSeq {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (i < 6) {
			sum += i + 1;
			i++;
		}
		System.out.print(sum);
	}
}