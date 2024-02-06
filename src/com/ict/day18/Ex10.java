package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Stream<Integer> stream1 = numbers.stream();
		// reduce(수행가능)
		Optional<Integer> sum = stream1.reduce((i, j) -> Integer.sum(i, j));
		System.out.println("합계 : " + sum);

		List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50);
		Stream<Integer> stream2 = numbers.stream();
		// reduce(초기값, 수행가능)
		int sum2 = stream2.reduce(1000, (i, j) -> Integer.sum(i, j));
		System.out.println("합계 : " + sum);

		int[] num = { 10, 20, 30, 40, 50 };
		IntStream intStream = IntStream.of(num);
		int total = intStream.sum();
		System.out.println("합계 : " + total);
		
		// 누적합 : sum = sum(이전합) + 현재값
		Stream<Integer> number3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> total2 = number3.reduce((x, y) -> x + y);
		System.out.println("합계 : " + total2);
	}
}
