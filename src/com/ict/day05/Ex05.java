package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		// 형식2)
		// 초기식 또는 현재 변수
		// while(true) {
		// if(빠져나갈 조건) break;
		// 실행할 내용;
		// 증감식;
		// }
		// * while의 끝을 만나면 조건식으로 이동

		// 0~10까지 출력
		int k1 = 0;
		while (true) {
			if (k1 >= 11)
				break;
			System.out.println(k1);
			k1++;
		}
		System.out.println();

		// 10~20까지 짝수만 출력
		int k2 = 10;
		while (true) {
			if (k2 >= 21)
				break;
			if (k2 % 2 == 0) {
				System.out.println(k2);
			}
			k2++;
		}
		System.out.println();

		// a~h까지 출력
		char c1 = 'a';
		while (c1 < 'h'+1) {
			System.out.println(c1);
			c1++;
		}
		System.out.println();
		
		char c2 = 'a';
		while (true) {
			if (c2 > 'h') break;
			System.out.println(c2);
			c2++;
		}

	}
}
