package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스를 객체로 만들어야
		// Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다.
		
		// Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04();
		
		System.out.println(t.name); // 홍길동
		
		// Ex04에 있는 play01메소드를 호출하자
		// play01이 void 이기 때문에 데이터를 가져오지는 않는다.
		// System.out.println(1);
		System.out.println(t.total); // 0
		t.play01();
		System.out.println(t.total); // 260
		// System.out.println(4);
		
		t.play02();
		// System.out.println(t.sum); // 지역변수이기 때문에 play02메서드 갔다오면 값이 사라짐
		
		int k = t.play03(); // 반환형이면 반드시 저장해줘야 함
		System.out.println(k); // 260
		
		
	}
}
