package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Minus{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
   System.out.print("Frist Number: \n");
int a = s.nextInt();
   System.out.print("Second Number: \n");
int b = s.nextInt();
int c = a-b;
   System.out.print("결과:" +c);
}
}

