package com.ict.day12;

public class Ex06_Animal {
	// final 변수 = 데이터 변경 방지 = 상수
	// final 메서드() = 오버라이딩 방지
	// final 클래스 = 상속 방지 (자식 클래스 생성 금지)
	
	int age = 2;
	final int month = 2;
	
	public void sound() {
		System.out.println("울음소리");
	}
	
	public final void sleep() {
		System.out.println("15이상 잠을 잔다.");
	}
}
