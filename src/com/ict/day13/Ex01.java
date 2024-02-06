package com.ict.day13;

// 인터페이스 : 서비스를 제공하는 목록
//			상수와 추상메서드로 구성되어 있음
//			생성자가 없음 (객체 생성 안됨)
//			**상속과 달리 인터페이스는 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현 할  수 있다.
//			인터페이스가 같다라는 뜻은 대체가 가능하다는 뜻
//			java 8 버전부터 지원 : 1) static 메서드 추가   2) default 메서드 (완전한 메서드) 추가 (나중에)

class Ex01 {
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;

	// public abstract void sound();
	// public void play();
}

interface Ex02 {
	// 원래는 변수명을 대문자 사용
	// static final 생략
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	// 일반 메서드 사용 못함
	// public void like(); {}
	
	// abstract 생략 가능
	public abstract void sound();
	public void play();
}
