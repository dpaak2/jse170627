package com.hanbit.algorithm.matrix;

public class MrSmith {
	public static void main(String[] args) {
		int[][] mts = new int[4][5];
		mts[3][4] = 5;
		String[][] mtx = { { "Good Morning", "Good After noon", "Good Evening", "Good Bye" },
				{ "Mr.", "Mrs.", "Miss", "My" }, { "Smith", "Alex", "John", "James" } };
		System.out.print(mtx[0][0] + "\t" + mtx[1][1] + "\t" + mtx[2][0] + "\n");
		System.out.print(mtx[0][3] + "\t" + mtx[1][2] + "\t" + mtx[2][1] + "\n");
		System.out.print(mtx[0][0] + "\t" + mtx[1][0] + "\t" + mtx[2][1] + "\n");
		System.out.print(mtx[0][2] + "\t" + mtx[1][3] + "\t" + mtx[2][3] + "\n");

	}
}