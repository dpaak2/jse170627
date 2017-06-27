package com.hanbit.algorithm.calculator;
import java.util.Scanner;
/* 초를 시간과 분으로 바꾸어 주는 프로그램입니다.
초를 입력해주세요.
60000
60000초 =16시간 40분 0초
*/

public class TimeCal{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("초를 입력해주세요! \n");
		int input =s.nextInt();
		
		int hour=input/3600;
		int min= (input-(hour*3600))/60;
		int sec= input-((hour*3600)+(min*60));
		
		System.out.print("minute: "+min+"\n");
		System.out.print("second: "+sec+"\n");
		System.out.print(String.format("시간은 %d 시간 %d 분 %d 초",hour,min,sec));
	}
	
}
