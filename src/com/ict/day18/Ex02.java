package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		// 스트림 생성 : 컬렉션이나 배열을 Stream으로 반환
		// 객체, 배열부터 스트림 생성
		// T = Type (자료형)
		// Stream<T> Stream.of(T... values) // 가변인자
		// Stream<T> Steam.of(T[])
		// Stream<T> Arrays.stream(T[])
		// Stream<T> Arrays.stream(T[], 시작 index, 끝 index) (끝index는 포함이 안된다.)
		String[] arr = { "홍길동", "고길동", "이길동", "박길동", "나길동" };
		List<String> list = Arrays.asList("둘리", "도우너", "고길동", "마이콜", "희동이");
		
		// 배열 이용
		Stream<String> stream01 = Stream.of("홍자바", "고자바", "이자바", "박자바", "나자바");
		Stream<String> stream02 = Stream.of(arr);
		Stream<String> stream03 = Arrays.stream(arr);
		Stream<String> stream04 = Arrays.stream(arr, 1, 4);
		
		// list
		// 컬렉션에는 stream()을 이용
		Stream<String> stream05 = list.stream();
		
		
		// 출력
		stream01.forEach(i -> System.out.print(i + "님 "));
		System.out.println();

		stream02.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		
		stream03.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		
		stream04.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		
		stream05.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
	}
}
