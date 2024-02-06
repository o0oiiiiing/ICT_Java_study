package com.ict.day03;

public class Ex03 {
	public static void main(String[] args) {
		// 논리연산자 : &&(AND, 논리곱, 교집합), ||(OR, 논리합, 합집합), !(NOT, 논리부정)
		// 논리연산자 대상은 boolean형(비교연산, 논리연산, 논리형)
		// 논리연산자의 결과는 boolean형
		
		// &&(AND, 논리곱, 교집합)
		// 주어진 조건들이 모두 참(true)일 때 결과는 참(true)
		// 조건들 중에 거짓(false)이 있으면 결과는 거짓(false)
		// **거짓 이후에 연산은 하지 않는다.
		// AND 조건을 이용하면 범위를 지정할 수 있다.
		// a >= 10 && a <= 20
		// a는 10부터 20까지의 범위를 의미한다.
		
		int su1 = 10;
		int su2 = 7;
		boolean res;
		
		// true = true && true
		res = (su1 >= 7) && (su2 >= 5); 
		System.out.println(res);
		
		// false = true && false
		res = (su1 >= 7) && (su2 <= 5); 
		System.out.println(res);

		// false = false && true
		res = (su1 <= 7) && (su2 >= 5); 
		System.out.println(res);

		// false = false && false
		res = (su1 <= 7) && (su2 <= 5); 
		System.out.println(res);
		
		System.out.println();
		
		// int su1 = 10, int su2 = 7
		res = ((su1 = su1 + 2) > su2) && (su1 == (su2=su2+5));
		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println();
		
		su1 = 10;
		su2 = 7;
		res = ((su1 = su1 + 2) < su2) && (su1 == (su2=su2+5));
		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		int su3 = 34;
		// su3값은 20~30 사이의 값이다.
		res = su3>=20 && su3<=30;
		System.out.println(res);
	
		res = su3>=30 && su3<=40;
		System.out.println(res);
		
		// char c1이 소문자인가?
		char c1 = 'G';
		res = c1>='a' && c1<='z';
		System.out.println(res);
		
		c1 = 'm';
		res = c1>='a' && c1<='z';
		System.out.println(res);
	}
}
