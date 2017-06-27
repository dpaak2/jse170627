package com.hanbit.algorithm.applicaiton;
import java.util.Scanner;
public class Bmi{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.print("나의 BMI 지수는? \n");
		System.out.print("insert your height: \n");
		double height=s.nextDouble()/100;
		System.out.print("insert your weight: \n");
		double weight=s.nextDouble();
		double bmi= weight/(height*height);
		String result=null;
		System.out.print("height in meter: "+height);
		System.out.print("BMI: "+bmi+"\n");
		if(30.0<bmi){
			result="비만 입니다";
		}else if(25.0<bmi){
			result="과체중 입니다";
		}else if(18.5<bmi){
			result="정상 입니다";
		} else {
			result="저체중 입니다";
		}
		System.out.print("당신은 "+result);
	}
	
}