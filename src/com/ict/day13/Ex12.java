package com.ict.day13;

enum Lesson{
	JAVA, JSP, SPRING, HTML
}

public class Ex12 {
	// 열거형(enum) : 상수를 하나의 객체로 인식하고, 여러개의 상수 객체들을 한 곳에 모아둔 하나의 묶음
	static final int KOR = 90;
	public static void main(String[] args) {
		System.out.println(KOR); // 데이터
		
		Lesson k = Lesson.JAVA;
		System.out.println(k); // 객체
		
		System.out.println(Lesson.HTML);
	}
}
