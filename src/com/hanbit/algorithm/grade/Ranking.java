package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class Ranking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("#####성적 랭킹 ##### \n");
		int arr[] = new int[3];
		String names[] = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("이름을 입력하세요 ");
			names[i] = s.next();
			System.out.print("점수를 입력하세요 ");
			arr[i] = s.nextInt();

		}
		/*
		 * names[0]=arr[0]; names[1]=arr[1]; names[2]=arr[2];
		 * 
		 */
		int num[] = new int[3];
		String ranking[] = new String[3];
		if (arr[0] > arr[1] && arr[0] > arr[2]) {
			num[0] = arr[0];
			ranking[0] = names[0];
			if (arr[1] > arr[2]) {
				num[1] = arr[1];
				ranking[1] = names[1];
				num[2] = arr[2];
				ranking[2] = names[2];
			} else {
				num[1] = arr[2];
				ranking[1] = names[2];
				num[2] = arr[1];
				ranking[2] = names[1];
			}
		}

		if (arr[1] > arr[0] && arr[1] > arr[2]) {
			num[0] = arr[1];
			ranking[0] = names[1];
			if (arr[0] > arr[2]) {
				num[1] = arr[0];
				ranking[1] = names[0];
				num[2] = arr[2];
				ranking[2] = names[2];
			} else {
				num[1] = arr[2];
				ranking[1] = names[2];
				num[2] = arr[0];
				ranking[2] = names[0];
			}
		}

		if (arr[2] > arr[1] && arr[2] > arr[0]) {
			num[0] = arr[2];
			ranking[0] = names[2];
			if (arr[0] > arr[1]) {
				num[1] = arr[0];
				ranking[1] = names[0];
				num[2] = arr[1];
				ranking[2] = names[1];
			} else {
				num[1] = arr[1];
				ranking[1] = names[1];
				num[2] = arr[0];
				ranking[2] = names[0];
			}
		}
		System.out.print("1등: " + ranking[0] + "," + num[0] + "; 2등: " + ranking[0] + "," + num[1] + "; 3등: "
				+ ranking[0] + "," + num[2] + "\n");
	}
}