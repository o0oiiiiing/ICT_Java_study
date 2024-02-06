package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {
		// map, peek, flatMap

		// map() : Stream 요소들을 변경한 새로운 Stream를 반환한다.
		// 단일 스트림의 원소를 매핑 시킨 후 매핑 시킨 값을 다시 스트림으로 변환하는 중간 연산
		// 객체에서 원하는 원소를 추출하는 역할을 한다고 볼 수 있음
		Stream<String> stream = Stream.of("Java", "jsp", "spring", "jqeury");
		stream.map(i -> i.toUpperCase()).forEach(i -> System.out.print(i + " "));
		System.out.println();

		List<Ex08> list = Arrays.asList(new Ex08("park", 20), new Ex08("kyoung", 35), new Ex08("seok", 67),
				new Ex08("test man", 10), new Ex08("test woman", 45));

		// 이름만 추출
		Stream<Ex08> stream2 = list.stream();
		stream2.map(i -> i.getName()).forEach(i -> System.out.print(i + " "));
		System.out.println();

		Stream<Ex08> stream3 = list.stream();
		Stream<String> nameList = stream3.map(i -> i.getName());
		nameList.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// flatMap() : 입력한 원소를 가장 작은 단위의 단일 스트림으로 반환한다.
		List<String> list2 = Arrays.asList("사과3팩", "멜론2팩", "딸기3팩");
		Stream<String> stream4 = list2.stream();
		List<String> list3 = stream4.flatMap(i -> {
			String s = i.substring(0, 2);
			int n = Integer.parseInt(i.substring(2, 3));
			String[] arr = new String[n];
			Arrays.fill(arr, s);
			return Stream.of(arr);
		}).collect(Collectors.toList()); // 새로운 리스트에 저장 (최종연산)
		System.out.println(list3);

		String[][] arr2 = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "d" }, { "a", "h" }, { "i", "j" } };
		
		Stream<String[]> stream5 = Arrays.stream(arr2);
		// stream5.forEach(i -> System.out.print(i + " ")); 배열 주소 5개만 보인다.
		stream5.map(i -> Arrays.toString(i)).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String[]> stream6= Arrays.stream(arr2);
		stream6.flatMap(i -> Arrays.stream(i)).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String[]> stream7= Arrays.stream(arr2);
		List<String> list4 = stream7.flatMap(i -> Arrays.stream(i)).collect(Collectors.toList());
		System.out.println(list4);
		System.out.println();
		
		// peek : forEach처럼 loop인데 중간 처리, forEach는 최종 처리
		//		  중간에 확인할 때 주로 사용
		Stream<String> stream8 = Stream.of("Java", "jsp", "spring", "jeqeury");
		stream8.map(i -> i.toUpperCase())
		.peek(i -> System.out.println(i + "배우기 "))
		.forEach(i->System.out.println(i+"~ "));
	}
}
