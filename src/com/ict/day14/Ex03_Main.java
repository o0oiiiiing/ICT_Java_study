package com.ict.day14;

public class Ex03_Main {
	public static void main(String[] args) {
		// 별도로 내부클래스를 생성할 수 없다.
		// Inner02 t1 = new Inner02();
		
		// 멤버내부클래스 처럼 생성 할 수 없다.
		// Ex03 t1 = new Ex03();
		// Ex03.Inner02 t2 = t1.new Inner02();
		
		// 메서드 안에 존재하기 때문에 메서드를 실행해야 된다.
		Ex03 t1 = new Ex03();
		t1.play(); // 내부클래스가 있는 메서드
		
	}
}
