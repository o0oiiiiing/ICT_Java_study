package com.ict.day19;

import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		
		System.out.println("직접처리");
		IntStream.range(0, 10).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 병렬처리해서 순서대로가 아니라 무작위로 출력
		System.out.println("병렬처리");
		IntStream.range(0, 10).parallel().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		System.out.println("직접처리");
		System.out.println(IntStream.rangeClosed(0, 10).sum());
	
		System.out.println("병렬처리");
		System.out.println(IntStream.rangeClosed(0, 10).parallel().sum());
	
	}
}
