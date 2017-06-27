package com.hanbit.algorithm.applicaiton;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("검색할 년도를 입력하세요");
		int year=s.nextInt();
		String result=null;
		if(year%400 ==0){
			result="윤년입니다";
		}else if(year%100==0){
			result="평년입니다";
		}else if(year%4==0){
			result="윤년입니다";
		}else{
			result="평년입니다";
		}
		System.out.print("result: "+result);
	}
}
