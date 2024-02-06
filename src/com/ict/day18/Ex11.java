package com.ict.day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("딸기", "바나나", "가지", "멜론", "수박");
		// naturalOrder() : 기본정렬을 뜻한다.
		Optional<String> o_min = str.stream().min(Comparator.naturalOrder());
		Optional<String> o_max = str.stream().max(Comparator.naturalOrder());
		// findAny : 요소중 하나의 요소를 반환
		Optional<String> o_findAny = str.stream().findAny();
		// findFirst : 요소중 첫번째 요소 반환
		Optional<String> o_findFirst = str.stream().findFirst();

		System.out.println(o_min.get());
		System.out.println(o_max.get());
		System.out.println(o_findAny.get());
		System.out.println(o_findFirst.get());

		List<Integer> num = Arrays.asList(1, 5, 9, 6, 10, 41, 2);
		Optional<Integer> i_min = num.stream().min(Comparator.naturalOrder());
		Optional<Integer> i_max = num.stream().max(Comparator.naturalOrder());
		Optional<Integer> i_findAny = num.stream().findAny();
		Optional<Integer> i_findFirst = num.stream().findFirst();
		
		System.out.println(i_min.get());
		System.out.println(i_max.get());
		System.out.println(i_findAny.get());
		System.out.println(i_findFirst.get());
	}
}
