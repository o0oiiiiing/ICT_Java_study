package com.ict.day14;

// 예외처리 : Exception (try ~ catch ~)
// 목적 : 비정상적인 종료를 정상적인 종료로 유도하고, 예외 발생시 예외에 대한 처리를 해준다.
// 형식 : try {
//			예외 발생 가능한 문장들;
//			예외 발생 가능한 문장들;
//			만약 예외가 발생하면 아래 문장을 무시하고, catch문으로 이동한다.
//			예외 발생 가능한 문장들;
//		} cathch(예외객체e) {
//			예외 발생 시 처리하는 문장들;
//		}
public class Ex08 {
	public static void main(String[] args) {
		int[] var = { 10, 20, 30 };
		try {
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
				System.out.println();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("여기는 catch");
			System.out.println(e);
		}
		System.out.println("수고하셨습니다.");
	}
}
