package com.ict.day02;

public class Ex06 {
	public static void main(String[] args) {
		// 형 변환 : 자동 형 변환, 강제 형 변환
		// 자동 형 변환 = 프로모션 : 작은 자료형이 큰 자료형을 변환하는 것 (저장하는 것)
		
		int s1 = 10;
		System.out.println(s1);
		long s2 = s1;
		System.out.println(s2);
		
		long s3 = 10 ;
		System.out.println(s3);
		
		// 강제 형 변환 = 디모션 : 큰 자료형이 작은 자료형으로 변환할 때 오류가 발생하여서 강제로 변경시키는 방법 
		//                    (데이터가 손실될 가능성이 있다)
		
		double d1 = 35.14;
		System.out.println(d1);
		int d2 = (int)(d1);
		System.out.println(d2);
		
		float f1 = (float)(5426.142);
		System.out.println(f1);
		
		//자동 형 변환
		int k1 = 'a';
		System.out.println(k1);
		
		// char가 0~65,535 사이의 값은 받을 수 있다.
		char k2 = 105;
		System.out.println(k2);
		
		int k3 = 105;
		System.out.println(k3);
		char k4 = (char)(k3);
		System.out.println(k4);
	}
}