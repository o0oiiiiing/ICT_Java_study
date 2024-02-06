package com.ict.day07;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// ** 같은 자료형이어야 한다.
		// 생성할 때 크기를 지정해야 된다. (지정하지 않으면 생성 안됨)
		// 한 번 지정한 크기는 변경이 안됨.
		// 배열 안에 데이터를 가져오기 위해서는 일반적으로 for문을 사용

		// 배열 생성 순서 : 선언 => 생성 => 초기화(데이터 저장)
		// 1. 선언 : 자료형 이름[]; 또는 자료형[] 이름;
		int su[]; // int[] su;

		// 2. 생성 : 이름 = new 자료형[배열 크기 = 방의 수];
		// new 예약어 : 메모리에 데이터를 저장할 공간을 만들어달라 => 인스턴스, 객체생성
		su = new int[4];

		// 3. 데이터 저장 : 이름[index = 위치 값 = 0부터 시작];
		// 데이터는 같은 자료형이어야 한다. (프로모션 가능 : 작은 자료형이 큰 자료형으로 변경)

		su[0] = 100;
		su[1] = 'a'; // 프로모션
		// su[2] = 3.14;
		su[2] = (int) (3.14); // 디모션
		su[3] = 100;

		su[2] = 107; // 변수

		// 배열 크기보다 크면
		// su[4] = 107; // 실행하면 오류 발생 (run time 오류)

		// 배열 호출하면 주소(생성ID)가 출력
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println();

		// 배열을 출력할 때는 보통 for문 사용
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}

	}
}