package com.ict.day12;

public class Ex06_Cat extends Ex06_Animal{
	
	public void play() {
		age = age + 10;
		System.out.println(age); //12
	}
	
	public void play2() {
		age = month + 10;
		
		// 사용하는 것은 가능, 데이터를 변경하는 것은 안됨
		// month = month + 10; // final이므로 오류가 난다. 값 변경X
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	
	
	// 부모클래스의 sleep()에 final이 있으므로
	// 오버라이딩 불가
//	@Override
//	public final void sleep() {
//		System.out.println("15이상 잠을 잔다.");
//	}
	
	
}
