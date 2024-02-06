package com.ict.day18;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex04 {
	public static void main(String[] args) {
		// 정수배열을 스트림으로 활용하기
		int[] arr = { 1, 2, 3, 4, 5 };
		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count();
		
		System.out.println("합계 : " + sumVal);
		System.out.println("카운트 : " + count);
	}
}
