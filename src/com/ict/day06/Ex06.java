package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자를 받아서 홀수인지, 짝수인지 출력하자
		esc: while (true) {
			System.out.print("숫자를 입력 : ");
			int su = scan.nextInt();
			String res = "";

			if (su % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");

			while (true) {
				System.out.print("계속하시겠습니까? (1.yes  2.no  >>)");
				int result = scan.nextInt();
				if (result == 1)
					continue esc;
				if (result == 2)
					break esc;

				System.out.println("제대로 입력하세요");
			} // 안쪽 while
		} // 밖 while

		System.out.println("수고하셨습니다.");

	}
}
