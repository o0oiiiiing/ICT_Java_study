package com.ict.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex02 {
	public static void main(String[] args) {
		// List 인터페이스 : 배열과 흡사한 구조,
		//  			  삽입, 삭제, 추가가 자유롭다.
		//  			  크기를 미리 지정하지 않아도 된다.
		// 구현한 클래스 : Stack, Vector, ArrayList
		// Vector : 멀티 스레드에서 동기화 지원
		// **ArrayList : 멀티 스레드에서 동기화 지원 X
		
		ArrayList<String> list = new ArrayList<String>();
		Vector<String> vector = new Vector<String>();
		
		// 추가
		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		
		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		
		System.out.println(list);
		System.out.println(vector);
		
		// 둘리를 삽입
		list.add(1, "둘리");
		vector.add(2, "둘리");
		
		// 중복 가능
		list.add("손흥민");
		list.add("이강인");
		
		vector.add("손흥민");
		vector.add("이강인");
		 
		System.out.println(list);
		System.out.println(vector);
		
		// 검색
		if (list.contains("이강인")) {
			System.out.println(list.indexOf("이강인"));
			System.out.println(list.get(list.indexOf("이강인"))); // 이강인 꺼내기
			// 둘리를 박지성으로 변경
			list.set(list.indexOf("둘리"), "박지성");
			// list는 firstElement()와 lastElement()가 없다.
		}
		System.out.println(list);
		System.out.println();
		
		if (vector.contains("이강인")) {
			System.out.println(vector.indexOf("이강인"));
			System.out.println(vector.get(vector.indexOf("이강인"))); // 이강인 꺼내기
			// 둘리를 박지성으로 변경
			vector.set(vector.indexOf("둘리"), "박지성");
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println(vector);
		System.out.println();
		
		// 하나씩 꺼내기
		for (String k : list) {
			System.out.println(k + "골");
		}
		System.out.println();
		
		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + "어시스트");
		}
	}
}
