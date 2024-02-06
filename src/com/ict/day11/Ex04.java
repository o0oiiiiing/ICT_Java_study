package com.ict.day11;

public class Ex04 {
	public static void main(String[] args) {
		// 객체를 생성할 때 나이가 3살, 이름이 "큰뿔소"이며 살아있음 지정하자
		Ex03 ex03 = new Ex03();

		System.out.println("이름 : " + ex03.getName());
		System.out.println("나이 : " + ex03.getAge());
		if (ex03.isLive() == true) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
	}
}
