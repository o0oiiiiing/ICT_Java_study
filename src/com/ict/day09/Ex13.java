package com.ict.day09;

public class Ex13 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	public void play02(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		// 메서드는 다른 메서드를 호출할 수 있다.
		play03();
		play04();
		play05(); // 방식은 다르지만 Ex12와 결과는 같다.
	}

	public void play03() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}

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

	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
}
