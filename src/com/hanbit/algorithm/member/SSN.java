package com.hanbit.algorithm.member;

import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("이름을 입력하여 주세요 \n");
		String name = s.next();
		System.out.print("주민등록 번호를 입력하세요 \n");
		String ssn = s.next();
		char ch = ssn.charAt(7);
		System.out.print("ch:" + ch + "\n");
		// String sYear=ssn.substring(0,2);
		int year = Integer.parseInt(ssn.substring(0, 2));
		int age = 0;

		/*
		 * int gap=17-year; if(gap>=0){ age=2017-(year+2000)+1; }else{
		 * age=2017-(year+1900)+1;
		 * 
		 * 
		 * ----삼항연산자 age=((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1; }
		 */
		String gender = "";
		switch (ch) {
		case '1':
		case '3':
			gender = "남자";
			break;
		case '2':
		case '4':
			gender = "여자";
			break;
		case '5':
		case '6':
			gender = "외국인";
			break;
		default:
			gender = "다시 입력하여 주십시오";
			break;
		}

		System.out.print(String.format("name: %s | age: %d  | gender: %s", name,
				((17 - year) >= 0) ? 2017 - (year + 2000) + 1 : 2017 - (year + 1900) + 1, gender));
	}
}