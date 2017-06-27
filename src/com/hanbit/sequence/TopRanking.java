package com.hanbit.sequence;

import java.util.Scanner;

public class TopRanking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int studs = 0, sum = 0, max = 0, min = 0, i = 0;
		System.out.print("1반의 총 학생수는 몇명?");
		studs = s.nextInt();
		int score[] = new int[studs];
		for (i = 0; i < studs; i++) {
			System.out.print("학생의 평균 점수를 입력하세요(100점 만점): ");
			score[i] = s.nextInt();
		}

		/*
		 * for(i=0;i<score.length;i++){ sum+=score[i]; } max=score[0];
		 * for(i=0;i<score.length;i++){ if(max<score[i]){ max=score[i]; } }
		 * min=score[0]; for(i=0;i<score.length;i++){ if(score[i]<min){
		 * min=score[i]; } }
		 */

		for (i= 0; i < score.length; i++) {
			sum += score[i];
			max = score[0];
			min = score[0];
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.print("1반의 평균점수는: " + sum / studs + "\n");
		System.out.print("1반의 최대점수는: " + max + "\n");
		System.out.print("1반의 최소점수는: " + min);

	}
}