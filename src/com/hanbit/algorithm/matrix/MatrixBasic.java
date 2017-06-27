package com.hanbit.algorithm.matrix;

public class MatrixBasic {
	public static void main(String[] args) {
		int[][] mtx = new int[3][5];
		for (int i = 0; i < mtx.length; i++) {
			for (int j = 0; j < mtx[i].length; j++) {
				System.out.print("[" + i + "," + j + "] \t");

			}
			System.out.print("\n");
		}
	}
}