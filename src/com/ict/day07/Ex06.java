package com.ict.day07;

import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		// 배열 정렬하기
		int[ ] su = {3, 4, 9, 8, 2, 1, 7, 10, 5, 6};
		
		// 자리 변경을 위한 임시 변수
		int tmp = 0;
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				// System.out.println("i = " + i + ", j = " + j);
				// i > j => 오름차순, i < j => 내림차순
				if(su[i] < su[j]) {
					// 자리변경
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		for (int i = 0; i < su.length; i++) {			
			System.out.println(su[i]);
		}
		
		
	}
}
