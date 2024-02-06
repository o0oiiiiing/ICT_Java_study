package com.ict.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex09_Main {
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~~~", "hello", "Good morning", "반갑습니다^^"};
		
		Stream<String> stream = Arrays.stream(greetings);
		String str = stream.reduce(new Ex09()).get();
		System.out.println(str);
	}
}
