package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 키보드로 입력받아서
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 둘째자리까지 구하자)
		Scanner scan = new Scanner(System.in);
		
		// 이름
		System.out.print("이름 : ");
		String name = scan.next();
		
		// 국어 점수
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		// 영어 점수
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		// 수학 점수
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		// 요구사항 구하기
		// 처리 = 비즈니스 로직
		int sum = kor + eng + math;
		
		double avg = (int)(sum / 3.0 * 100) / 100.0;
	
		// 출력		
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + avg + "점");
		
	}
}
