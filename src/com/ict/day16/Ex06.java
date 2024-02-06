package com.ict.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가 출력되는 프로그램 작성
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		Set<String> keys = map.keySet();
		
		esc: while (true) {
			System.out.print("나라 입력 >> ");
			String str = scan.next();
			if (keys.contains(str)) {
				String res = map.get(str);
				System.out.println(str + "의 수도는 " + res + "입니다.");
			} else {
				System.out.println("데이터가 없는 나라");
			}
			while (true) {
				System.out.println("계속할까요(y/n) >> ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("제대로 입력하세요");
					continue;
				}
			}
		}

//		esc: while (true) {
//			System.out.print("나라입력 >> ");
//			String country = scan.next();
//			// 결과
//			if (map.get(country) == null) {
//				System.out.println("데이터에 없는 나라입니다.\n");
//				continue esc;
//			} else {
//				System.out.println(country + "의 수도는 " + map.get(country) + "입니다.\n");
//			}
//
//			// 계속?
//			while (true) {
//				System.out.print("계속하시겠습니까? (y/n) >> ");
//				String result = scan.next();
//				if (result.equalsIgnoreCase("y")) {
//					System.out.println();
//					continue esc;
//				} else if (result.equalsIgnoreCase("n")) {
//					break esc;
//				} else {
//					System.out.println("다시 입력해주세요\n");
//					continue;
//				}
//			}
//		}
//		System.out.println("수고하셨습니다."); 
	}
}
