package com.ict.day12;

// 부모 클래스
// Object 클래스 상속받고 있음
public class Ex01_Sup {
	String name = "홍길동";
	int age = 57;
	String addr = "서울 방학동";
	private String dog = "댕댕이"; // 댕댕
	static int car = 1;
	static final boolean GENDER = true;
	
	public Ex01_Sup() {
		System.out.println("부모 생성자 : " + this);
	}
}
