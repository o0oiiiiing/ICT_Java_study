package com.ict.day03;

public class Ex01 {
	public static void main(String[] args) {
		// 증감 연산자 : 1 증가 또는 1 감소하는 연산자
		// ++(--) 변수 : 현재 변수가 가지고 있는 값에 1을 증가(감소)하고 나머지를 실행
		// 변수 ++(--) : 현재 변수를 가지고 실행한 후 그 명령구문이 끝날 때 1을 증가(감소)한다.
		
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1 + 4);
		System.out.println(su2++ + 4);
		System.out.println(su1);
		System.out.println(su2);
	}
}
