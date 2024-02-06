package com.ict.day07;

import java.util.Iterator;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// String[] name = new String [5];
		String[] name = { "", "", "", "", "" };
		int[] kor = { 0, 0, 0, 0, 0 };
		int[] eng = { 0, 0, 0, 0, 0 };
		int[] math = { 0, 0, 0, 0, 0 };

		int[] sum = { 0, 0, 0, 0, 0 };
		double[] avg = { 0.0, 0.0, 0.0, 0.0, 0.0 };
		String[] hak = { "", "", "", "", "" };
		int[] rank = { 1, 1, 1, 1, 1 };

		// 이름, 점수 입력
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			System.out.println();

			// 총점, 평균, 학점 구하기
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}

		// 순위 구하기
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		// 최종 출력
		System.out.println("이  름\t총  점\t평  균\t학  점\t순  위");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.print(rank[i] + "위\n");
		}

	}
}
