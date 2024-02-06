package com.ict.day16;

import java.util.Iterator;
import java.util.Stack;

/*
 List 인터페이스 : 배열과 흡사한 구조,
 				삽입, 삭제, 추가가 자유롭다.
 				크기를 미리 지정하지 않아도 된다.
 구현한 클래스 : Stack, Vector, ArrayList
 구조 : LIFO(Last In First Out)
 	   마지막에 들어온 데이터가 먼저 나가는 형태
 add, push, addElement → 추가
 add(index, E)		  → 삽입
 pop : 맨 위에 존재하는 객체 반환 후 삭제한다.
 peek : 맨 위에 존재하는 객체 반환 후 삭제하지 않는다.
 contains(Element e) : boolean → 해당 Element가 포함되어 있으면 true, 없으면 false
 search : 검색 (오른쪽 1부터)
 **indexOf : 검색 (왼쪽 0부터) → 배열 형식처럼
 elementAt(index) : 해당 요소 반환
 **get(index) : 해당 요소 반환
 firstElement() : 맨 처음 요소 반환
 lastElement() : 맨 마지막 요소 반환
 setElementAt(Element, index) : 치환
 */

public class Ex01 {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.add("둘리"); // 추가
		s1.push("공실이"); // 추가
		s1.addElement("마이콜"); // 추가

		s1.add(1, "고길동"); // 삽입
		s1.add(3, "희동이"); // 삽입
		System.out.println(s1);

		// 마지막 객체 보기 : pop(삭제), peek, lastElement
		String res = s1.peek(); // peek는 마지막에 뭐가 있는지만 알려준다.
		System.out.println("가지고 온 객체 : " + res);
		System.out.println(s1);

		res = s1.pop(); // pop은 마지막에 있는 걸 가지고 온 다음에 삭제
		System.out.println("가지고 온 객체 : " + res);
		System.out.println(s1);

		res = s1.lastElement();
		System.out.println("가지고 온 객체 : " + res);
		System.out.println(s1);

		if (s1.contains("둘리")) {
			// 위치 검색
			System.out.println(s1.indexOf("희동이")); // 3 (왼쪽 0부터)
			System.out.println(s1.search("희동이")); // 1 (오른쪽 1부터)

			// 위치값을 이용해서 Element 반환
			System.out.println(s1.get(1));
			System.out.println(s1.elementAt(1));

			// 처음 마지막 요소 반환
			System.out.println(s1.firstElement()); // 처음
			System.out.println(s1.lastElement()); // 마지막
		} else {
			System.out.println("존재하지 않습니다.");
		}

		// 고길동을 도우너로 변경하자
		if (s1.contains("고길동")) {
			s1.setElementAt("도우너", s1.indexOf("고길동"));
		}
		System.out.println(s1);

		// 중복가능
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		System.out.println(s1);
		System.out.println(s1.size()); // 크기(인덱스X)

		// 하나씩 꺼내기
		for (String k : s1) {
			System.out.println(k + "님!!!");
		}
		System.out.println();

		Iterator<String> it = s1.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str + "짱 ^^");
		}
		System.out.println();

		// 하나씩 꺼낸다.(LIFO)
		while (!s1.isEmpty()) {
			String k = s1.pop();
			System.out.println(k + ", 크기는 " + s1.size() + "이다.");
		}
	}
}
