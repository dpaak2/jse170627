package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Operation{
public static void main(String[]args){
System.out.print("select op code: 1.+ 2.- 3.* 4./ \n");
Scanner s =new Scanner(System.in);
System.out.print("enter first number: \n");
int num1=s.nextInt();
System.out.print("enter second number: \n");
int num2=s.nextInt();
System.out.print("insert op-code: ");
String opcode=s.next();
int result=0;
if(opcode.equals("+")){
	result=num1+num2;
}else if(opcode.equals("-")){
	result=num1-num2;
} else if(opcode.equals("*")){
	result=num1*num2;
	}else{
	result=num1/num2;	
}
System.out.print("result: "+result);
}
}