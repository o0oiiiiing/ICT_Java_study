package com.ict.day10;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 t = new Ex11();
		
		// 변경 전 이름 가져오기 (getter)
		System.out.println(t.getName());
		
		// 홍길동 이름을 둘리로 변경하자 (setter)
		t.setName("둘리");
		
		// 변경 후 이름 가져오기
		System.out.println(t.getName());
		
		// 나이가 24인데 15000로 변경하자
		t.setAge(15000);
		System.out.println(t.getAge());
	}
}
