package com.ict.day14;

// Member 내부클래스
public class Ex02 {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;
	
	// 생성자 
	public Ex02() {
		System.out.println("외부 : " + this);
	}
	
	// 외부클래스의 메서드
	public void sound() {
		// 외부클래스의 멤버들은 불러올 수 있다.
		System.out.println(name);
		// 내부클래스의 멤버들은 불러올 수 없다.
		// System.out.println(addr);
		System.out.println("외부클래스의 메서드");
	}
	
	// 내부 클래스
	public class Inner01{
		String addr = "서울 마포구 백범로";
		int room = 5;
		
		// 생성자
		public Inner01() {
			System.out.println("내부 : " + this);
		}
		
		public void play() {
			System.out.println(addr);
			System.out.println(room);
			// 외부클래스의 멤버를 마음대로 사용 가능 (private 가능)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			// 외부클래스의 멤버메서드를 마음대로 사용 가능
			sound();
		}
	} // 내부 클래스
} //외부 클래스
