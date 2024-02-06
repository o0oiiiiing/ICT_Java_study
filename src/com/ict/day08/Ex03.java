package com.ict.day08;

import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// 가변길이
		// 선언 : 자료형[][] 이름; 또는 자료형 이름[][]
		int[][] su;

		// 생성 : 이름 = new 자료형[1차원 배열의 수][];
		su = new int[3][];

		// 초기값 : 고정길이에 사용하는 초기값은 사용 불가 => 실행 오류 발생
//		su[0][0] = 10;
//		su[0][1] = 20;
//		
//		su[1][0] = 10;
//		su[1][1] = 20;
//		
//		su[2][0] = 10;
//		su[2][1] = 20;

		// 가변길이 배열은 1차원 배열을 여러개 만들어서 참조하는 방법을 사용
		int[] k1 = { 10, 20 };
		int[] k2 = { 100, 200, 300, 400, 500 };
		int[] k3 = { 100, 200, 300 };

		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
			System.out.println();
		}

		// 선언과 생성을 한 번에
		char[][] ch = new char[4][];

		char[] c1 = { 'j', 'a', 'v', 'a' };
		char[] c2 = { 'j', 's', 'p' };
		char[] c3 = { 's', 'p', 'r', 'i', 'n', 'g' };
		char[] c4 = { 'r', 'e', 'a', 'c', 't' };
		
		ch[0] = c1;
		ch[1] = c2;
		ch[2] = c3;
		ch[3] = c4;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
			System.out.println();
		}

	}
}
