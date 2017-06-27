package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Calculator{
public static void main(String[]args){
 Scanner scanner = new Scanner(System.in);
 System.out.print("계산기\n");
 System.out.print("첫번째 숫자 입력: \n");
 int firstNumber= scanner.nextInt();
 System.out.print("두번째 숫자 입력: \n");
 int secondNumber = scanner.nextInt();
 int result=firstNumber+secondNumber;
 System.out.print("Result: "+result);
}
}