package com.ict.day03;

public class Ex07 {
	public static void main(String[] args) {
		// 2시간 40분 30초를 초로 환산 하여라. (몇 초일까요?)
		
		int hour = 2;
		int minute = 40;
		int second = 30;
		
		int totalSec = (hour*3600) + (minute*60) + second;
		System.out.println(totalSec + "초 입니다.");
	}
}
