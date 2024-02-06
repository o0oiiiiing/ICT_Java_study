package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case : 다중 if~else문과 같은 조건문
		// if문 조건식 boolean형, 즉 비교연산, 논리연산, boolean형일 때
		// switch문 인자값이 int 이하, char, String일 때 사용
		// long, 실수형일 때 사용 불가
		// 형식) switch(인자값 = int, char, String) {
		// case 조건값1 : 인자값과 조건값1이 같을 때 수행할 문장; break;
		// case 조건값2 : 인자값과 조건값1이 같을 때 수행할 문장;
		// 인자값과 조건값1이 같을 때 수행할 문장; break;
		// case 조건값3 : 인자값과 조건값1이 같을 때 수행할 문장; break;
		// default : 조건값1, 2, 3 모두 같지 않을 때 수행할 문장;
		// }
		// ** 주의사항 : break가 없으면 break를 만날 때까지 모든 실행문을 실행한다.
		// break문의 역할은 현재 실행 중인 범위({} 블록)를 벗어나는 역할을 한다.
		// default는 생략 가능

		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노 4이면 과일주스
		int k1 = 3;
		String result = "";

		if (k1 == 1) {
			System.out.println("카페모카");
		} else if (k1 == 2) {
			System.out.println("카페라떼");
		} else if (k1 == 3) {
			System.out.println("아메리카노");
		} else if (k1 == 4) {
			System.out.println("과일주스");
		}

		// if문은 순서대로 내려오므로 switch문에 비해서 느리다.
		switch (k1) {
		case 1:
			System.out.println("카페모카");
			break;
		case 2:
			System.out.println("카페라떼");
			break;
		case 3:
			System.out.println("아메리카노");
			break;
		case 4:
			System.out.println("과일주스");
			break;
		}

		// char k2이 A이면 아프리카, B이면 브라질, C이면 캐나다, 나머지 한국
		char k2 = 'A';
		String country = "";

		switch (k2) {
		case 'A':
			country = "아프리카";
			break;
		case 'B':
			country = "브라질";
			break;
		case 'C':
			country = "캐나다";
			break;
		default:

			country = "한국";
			; // break 없어도 오류X
		}
		System.out.println("결과 : " + country);

		// char k3가 A이거나 a이면 아프리카 B이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국
		char k3 = 'A';
		String country2 = "";

		switch (k3) {
		case 'A':
			country2 = "아프리카";
			break;
		case 'a':
			country2 = "아프리카";
			break;
		case 'B':
			country2 = "브라질";
			break;
		case 'b':
			country2 = "브라질";
			break;
		case 'C':
			country2 = "캐나다";
			break;
		case 'c':
			country2 = "캐나다";
			break;
		default:
			country2 = "한국";
			;
		}
		System.out.println("결과 : " + country2);

		// char k4가 A이거나 a이면 아프리카 B이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국
		char k4 = 'b';
		String country3 = "";

		switch (k4) {
		case 'A':
		case 'a':
			country3 = "아프리카";
			break;
		case 'B':
		case 'b':
			country3 = "브라질";
			break;
		case 'C':
		case 'c':
			country3 = "캐나다";
			break;
		default:
			country3 = "한국";
			;
		}
		System.out.println("결과 : " + country3);

		// String k5가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워싱턴
		String k5 = "한국";
		String res = "";

		switch (k5) {
		case "한국":
			res = "서울";
			break;
		case "중국":
			res = "베이징";
			break;
		case "일본":
			res = "도쿄";
			break;
		case "미국":
			res = "워싱턴";
			break;
		}
		System.out.println("결과 : " + res);

		// switch문 범위가 넓어지면 사용하지 말자 (if문 사용하자)
		// int k6의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F

		int k6 = 93;
		String result6 = "";
//		switch (k6) {
//			case 100: break;
//			case 99: break;
//			case 98: break;
//			~
//			default:
//				break;
//			}
		switch ((int) (k6 / 10)) {
		case 10:
		case 9:
			result6 = "A";
			break;
		case 8:
			result6 = "B";
			break;
		case 7:
			result6 = "C";
			break;
		default:
			result6 = "F";
			break;
		}
		System.out.println("결과 : " + result6);

	}
}
