package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어 90, 영어 80, 수학 80 이다.
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리까지 구하자)
		
		// 입력정보
		// 이름 저장
		String name = "홍길동";
		// 국어 저장
		int kor = 90;
		// 영어
		int eng = 80;
		// 수학
		int math = 80;
		
		// 요구사항 (처리 = 비즈니스 로직)
		// 총점과 평균
		int sum = kor + eng + math;
		// 정수와 실수가 산술연산하면 실수가 된다.(소수점이 있다.)
		double avg = (int)(sum / 3.0 * 10) / 10.0;
		double avg2 = (int)(sum / 3.0 * 100) / 100.0;
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + avg2);
		
		// 끝의 5를 버릴 때
		int k1 = (198745/10) * 10;
		// 끝의 두자리 45를 버릴 때
		int k2 = (198745/100) * 100;
		System.out.println(k1);
		System.out.println(k2);
		
	}
}
