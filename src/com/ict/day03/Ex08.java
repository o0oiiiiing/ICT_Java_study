package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초일까?
		
		int totalSec = 3989;
		int hour = totalSec / 3600;
		int minute = (totalSec - (hour*3600)) / 60;
		int second = totalSec - (hour*3600) - (minute*60);
		
		System.out.println(totalSec + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다.");
		
		
		// 선생님
		// int total = 3989;
		// int h = 0;
		// int m = 0;
		// int s = 0;
		// int res = 0; 나머지 저장
		
		// 시간을 구하자
		// h = total / (60 * 60)
		// res = total % (60 * 60);
		// m = res / 60;
		// s = res % 60;
		// System.out.println(h);
		// System.out.println(m);
		// System.out.println(s);
	}
}
