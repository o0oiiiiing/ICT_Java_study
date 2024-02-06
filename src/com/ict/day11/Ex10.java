package com.ict.day11;

public class Ex10 {
	public static void main(String[] args) {
		// 기본 생성자
		Ex09 ex09 = new Ex09();
		System.out.println("이름 : " + ex09.getName());
		System.out.println("나이 : " + ex09.getAge());
		System.out.println("주소 : " + ex09.getAddr());
		System.out.println();
		
		Ex09 ex092 = new Ex09("땡구");
		System.out.println("이름 : " + ex092.getName());
		System.out.println("나이 : " + ex092.getAge());
		System.out.println("주소 : " + ex092.getAddr());
		System.out.println();
		
		Ex09 ex093 = new Ex09("짱구", 5);
		System.out.println("이름 : " + ex093.getName());
		System.out.println("나이 : " + ex093.getAge());
		System.out.println("주소 : " + ex093.getAddr());
		System.out.println();
	}
}
