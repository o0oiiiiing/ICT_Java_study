package com.ict.day09;

public class Ex08 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	// 외부에서 이름을 받아서 넣기
	// 외부 데이터는 메서드의 인자를 통해서 받는다.
	// 메서드이름([인자]) { 실행내용 }
	// 인자 => 자료형 변수
	public void play01(String k1) {
		name = k1;
	}

	// 총점
	public void play02(int k1, int k2, int k3) {
		sum = k1 + k2 + k3;
	}

	// 평균
	public void play03() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}

	// 학점
	public void play04() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}
	
	// 출력
	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}

}
