package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
		// Math 클래스 주요 메서드
		// : 수학에서 자주 사용하는 상수들과 static 함수들을 미리 구현해 놓은 클래스
		
		// 상수 : E, PI
		System.out.println(Math.E); // 자연 로그의 밑 값 2.718...
		System.out.println(Math.PI); // 원주율 3.14...
		
		// 메서드 모두 static이다.
		// 생성자는 없다. => 객체 생성으로 할 수 없다. Math.메서드()로 접근가능하다.
		
		// 1. random() : 0.0부터 1.0 미만의 임의의 난수 발생
		System.out.println(Math.random());
		int k1 = (int)(Math.random()); // 무조건 0
		int k2 = (int)(Math.random()*10); // 0 ~ 9;
		int k3 = (int)(Math.random()*3); // 0 ~ 2;
		
		// 2. ceil() : 올림, round() : 반올림, floor가 버림
		System.out.println("Ceil : 가장 큰 정수");
		System.out.println(Math.ceil(10.0));	// 10
		System.out.println(Math.ceil(10.1231));	// 11
		System.out.println(Math.ceil(-10.0));	// -10
		System.out.println(Math.ceil(-10.1231));	// -10
		
		System.out.println("floor : 가장 작은 정수");
		System.out.println(Math.ceil(10.0));	// 10
		System.out.println(Math.ceil(10.984));	// 10
		System.out.println(Math.ceil(-10.0));	// -10
		System.out.println(Math.ceil(-10.984));	// -11
		
		System.out.println("round : 반올림(소수점 첫째자리기준)");
		System.out.println(Math.round(10.0)); // 10
		System.out.println(Math.round(10.4)); // 10
		System.out.println(Math.round(10.45)); // 11
		
		// abs() : 절대값 (양수 -> 양수, 음수 -> 양수)
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-10.1231));
		
		// max(수1, 수2) : 큰 값, min(수1, 수2) : 작은 값
		System.out.println(Math.max(15, 15.0009));
		System.out.println(Math.min(15, 15.0009));
		
		
		
	}
}
