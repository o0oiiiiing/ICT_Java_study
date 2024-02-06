package com.ict.day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex18 {
	public static void main(String[] args) {
		// 날짜 관련 클래스
		// 1. Date 클래스 (1.0)
		// 2. Calender 클래스 (5.0)
		// 3. LocalDate 클래스 (8.0)

		// 1. Date 클래스
		Date date = new Date();
		System.out.println(date);

		// 기본 형태 변환
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(date));

		// 기본 형태 변환
		SimpleDateFormat sf2 = new SimpleDateFormat("yy-M-d H:m:s");
		System.out.println(sf2.format(date));

		// 년, 월, 일, 시, 분, 초, 요일
		System.out.println(date.getYear()); // 현재년도 - 1900 = 124
		System.out.println(date.getMonth() + 1 + "월"); // 0-11
		System.out.println(date.getDate() + "일");
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");

		int k = date.getDay(); // 0 => 일요일, ~6 => 토요일
		switch (k) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		}

	}
}
