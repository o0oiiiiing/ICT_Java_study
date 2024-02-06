package com.ict.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex12 {
	public static void main(String[] args) {
		// collect : 스트림을 컬렉션으로 반환
		Stream<String> s = Stream.of("a", "b", "c", "d", "z");
		HashSet<String> set = s.collect(Collectors.toCollection(() -> new HashSet<String>()));
		set.add("h");
		set.add("w");
		System.out.println(set);

		// Map
		Stream<String> str = Stream.of("나", "우리", "너", "모두", "노래해요");
		// 길이가 같은 것끼리 연결해서 만듦
		Map<Integer, String> res01 = str.collect(Collectors.groupingBy(i -> i.length(), Collectors.joining()));
		System.out.println(res01);

		int[] index = { 1 };
		Stream<String> str2 = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Integer, String> res02 
			= str2.collect(Collectors.toMap(i -> index[0]++, j -> j));
		System.out.println(res02);

		str = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Object, Object> res03 = str.collect(Collectors.toMap(i -> i, j -> j));
		System.out.println(res03);
		
		// 홀수와 짝수 묶어서 합계구하기
		List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 14, 15, 17, 18, 19, 20 });
		Map<String, Integer> map = list.stream()
				// 홀수와 짝수를 그룹화 (key값)
				.collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "even" : "odd", 
						// 누적합 (value)
						Collectors.reducing(0, (i1, i2) -> i1 + i2)));
		System.out.println(map);

	}
}
