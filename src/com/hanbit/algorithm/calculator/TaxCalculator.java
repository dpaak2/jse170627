package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String [] args){
		Scanner s =new Scanner(System.in);
		System.out.print("Name: ");
		String name=s.next();
		System.out.print("Salary: ");
		int salary=s.nextInt();
		double taxRate=0;
		
		if(88000<salary){
			taxRate=0.35;
		}else if (4600<salary){
			taxRate=0.26;
		} else if (1200<salary){
			taxRate=0.17;
		} else{
			taxRate=0.08;
		}
		//()?;:
		
					  System.out.print("***********************************\n");
					  System.out.print(" 이름 | 연봉 | 세율 | 납부할 세금 |\n");
				      System.out.print("-----------------------------------\n");
		System.out.print(String.format(" %s 님| %d 만원 | %f %| %d 만원 |\n",name,salary,taxRate,(int)(salary*taxRate)/10000));
		              System.out.print("***********************************");
	}
}
