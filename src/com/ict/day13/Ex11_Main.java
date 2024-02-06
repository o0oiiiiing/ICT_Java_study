package com.ict.day13;

public class Ex11_Main {
	public static void main(String[] args) {
		toPlay2("홍길동");

		// 인터페이스는 객체로 생성 못한
		// Ex11_IBehavior ibe = new Ex11_IBehavior();
		
		// 기본
		// Ex11_Soccer soccer = new Ex11_Soccer();
		// Ex11_BassGuitar bassGuitar = new Ex11_BassGuitar();
		
		// 상속받으므로 이렇게 쓸 수도 있다.
		Ex11_IBehavior soccer = new Ex11_Soccer();
		Ex11_IBehavior bassGuitar = new Ex11_BassGuitar();
		toPlay(bassGuitar);
		System.out.println();
		
		toPlay(new Ex11_Soccer());
	}

	public static void toPlay(Ex11_IBehavior ib) {
		ib.play();
	}

	public static void toPlay2(String str) {
		System.out.println(str + "님 성공");
	}
}
