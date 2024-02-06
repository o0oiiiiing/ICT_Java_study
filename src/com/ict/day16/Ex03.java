package com.ict.day16;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		// Queue 인터페이스 : FIFO (First In First Out)
		// 먼저 들어온 정보가 먼저 나감
		// 구현한 클래스 : LinkedList(멀티 스레드 동기화X)

		LinkedList<String> linkedList = new LinkedList<String>();
		// 추가 삽입 : add, addFirst, offer, offerFirst, offerLsat
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("공실이");
		linkedList.add(2, "마이콜");

		System.out.println(linkedList);

		if (linkedList.contains("마이콜")) {
			System.out.println(linkedList.indexOf("마이콜"));
			System.out.println(linkedList.get(2));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
		}
		System.out.println();

		// 고길동을 도우너로 변경하자
		linkedList.set(linkedList.indexOf("고길동"), "도우너");
		System.out.println(linkedList + "\n");

		// 하나씩 꺼내기
		for (String k : linkedList) {
			System.out.println(k + "!");
		}
		System.out.println();

		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k + " 호잇✨");
		}
	}
}
