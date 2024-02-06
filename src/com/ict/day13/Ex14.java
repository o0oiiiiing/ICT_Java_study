package com.ict.day13;

import java.util.Iterator;

enum Type2 {
	WALK("워킹화", 250), RUN("런닝화", 255), TRACK("트래킹화", 265), HIKE("하이키화", 275);

	private final String name;
	private final int size;

	// getter만 생성
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	// 생성자 역할을 하는 놈
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

}

public class Ex14 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + " : " + arr[i].getSize());
		}
	}

}
