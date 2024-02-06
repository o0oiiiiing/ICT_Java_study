package com.ict.day12;

public class Ex04_Main {
	public static void main(String[] args) {
		// 자식 클래스를 객체 생성하면 (생성자 호출)
		// 자식 클래스의 부모클래스의 생성자 호출
		Ex04_Game ex04_Game = new Ex04_Game();
		System.out.println();
		
		// 게임하기
		ex04_Game.play();
		// 자식클래스에게 없지만 부모클래스에게 있으므로 사용 가능
		ex04_Game.sound();
		// 부모의 부모클래스에 존재해도 사용 가능
		ex04_Game.call();
		ex04_Game.sms();
		
		// 부모의 부모클래스인 Phone이 아니라 부모클래스인 MP3의 변수로 찍힘
		System.out.println(ex04_Game.number);
		System.out.println();
		
		Ex04_DCa ex04_DCa = new Ex04_DCa();
		ex04_DCa.call();
		ex04_DCa.sms();
		ex04_DCa.picture();
	}
}
