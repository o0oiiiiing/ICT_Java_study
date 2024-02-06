package com.ict.day09;

public class Ex10 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	public void play(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		avg = (int)(sum/3.0*10)/10.0;
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else{
			hak = "F학점";
		}
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
}
