package com.ict.day10;

public class Ex04 {
	public static void main(String[] args) {
		// 오버로딩 실행
		Ex03 ex03 = new Ex03();
		double k1 = ex03.plus(10, 12);
		System.out.println(k1);
		
		k1 = ex03.plus(10.4, 15.8);
		System.out.println(k1);
		
		k1 = ex03.plus("10.4", "15.8");
		System.out.println(k1);
		
	}
}
