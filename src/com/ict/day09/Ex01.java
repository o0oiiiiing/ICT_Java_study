package com.ict.day09;

public class Ex01 {
	// 클래스 : 멤버필드, 멤버메서드, 생성자
	// 멤버필드 : 데이터, 상태값, 속성, 특징
	// 데이터 = 변수 & 상수
	// 변수 : 언제든지 변할 수 있는 상태값
	// 상수 : 한 번 저장되면 변경할 수 없는 상태값, final
	
	// 인스턴스 변수와 상수는 클래스가 객체로 생성될 때 함께 생성되는 변수와 상수
	// 호출 : 참조변수.멤버필드 또는 참조변수.멤버메서드
	
	// static 변수와 상수는 객체 생성과 상관없이 먼저 만들어져 있는 변수와 상수이다. (static 표시가 있음)
	// 호출 : 클래스이름.멤버필드() 또는 클래스이름.멤버메서드()
	
	// 전부 전역변수
	String name = "홍길동"; 					// instance 변수
	int kor = 80; 							// instance 변수
	static int eng = 85; 					// static 변수
	final int MATH = 90; 					// instance 상수
	static final int COMPUTER = 95;			// static 상수
}
