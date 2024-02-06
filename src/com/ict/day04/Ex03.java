package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
		// 형식) 자료형 변수 = (조건식) ? ((조건식)?참일때:거짓일때) : 거짓일 때 실행할 문장;
		// 형식) 자료형 변수 = (조건식) ? 참일 때 실행할 문장 : ((조건식)?참일때:거짓일때);
		
		
		// int k1이 90이상이면 "A학점", 80점 이상이면 "B학점", 나머지는 "F학점"
		int k1 = 80;
		String result = (k1 >= 90) ? "A학점" : ((k1>=80)?"B학점":"F학점");
		System.out.println("결과 : " + result);
		
		
		// char k2가 대문자이지, 소문자인지, 기타문자인지 판별하자
		char k2 = '2';
		String result2 = (k2>='A' && k2<='Z') ? "대문자" : ((k2>='a' && k2<='z') ? "소문자" : "기타문자");
		System.out.println("결과 : " + result2);
		
		
		// int k3가 1또는 3이면 남자, 나머지 여자
		int k3 = 1;
		String result3 = (k3==1 || k3==3) ? "남자" : "여자";
		System.out.println("결과 : " + result3);
		
		
		// int k4가 1 또는 3은 남자, 2 또는 4는 여자
		int k4 = 1;
		String result4 = (k4==1 || k4==3) ? "남자" : ((k4==2 || k4==4) ? "여자" : "외계인");
		System.out.println("결과 : " + result4);
		

		// int k5가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		// int k5가 2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 여자
		int k5 = 4;
		String result5 = (k5==1 || k5==3) ? ((k5==1) ? "1900년대 태어난 남자" : "2000년대 태어난 남자")
					: ((k5==2 || k5==4) ? ((k5==2) ? "1900년대 태어난 여자" : "2000년대 태어난 여자") : "외계인");
		System.out.println("결과 : " + result5);
		
		// 두 수 중 큰 수를 구하자
		int su1 = 14;
		int su2 = 9;
		int res = (su1 > su2) ? su1 : su2;
		System.out.println(res);
		
		int res2 = Math.max(su1, su2);
		System.out.println(res2);
	}
}
