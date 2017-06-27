package com.hanbit.sequence;

import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("*숫자로 입력하여 주세요 0.종료 1.시작 2.BNI 계산기  3. 4. 5. 6. \n");
			String menu = s.next();
			switch (menu) {
			case "0":
				System.out.print("시스템 종료!!");
				return;
			case "1":
				System.out.print("시스템 시작!!");
				break;
			case "2":
				System.out.print("BMI");
				break;
			}
		}
	}
}