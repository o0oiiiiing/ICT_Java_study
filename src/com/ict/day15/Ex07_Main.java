package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Ex07를 담을 set 컬렉션을 만들자.
		HashSet<Ex07> set1 = new HashSet<Ex07>();
		esc: while (true) {
			System.out.print("이름 : ");
			String name = scan.next();

			System.out.print("국어 : ");
			int kor = scan.nextInt();

			System.out.print("영어 : ");
			int eng = scan.nextInt();

			System.out.print("수학 : ");
			int math = scan.nextInt();

			Ex07 p = new Ex07(name, kor, eng, math);
			set1.add(p);

			while (true) {
				System.out.print("계속할까요? (y/n) >> ");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				} else if (str.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}

		// 순위
		for (Ex07 i : set1) {
			for (Ex07 j : set1) {
				if (i.getSum() < j.getSum()) {
					i.setRank(i.getRank() + 1);
				}
			}
		}

		// 정렬 X
		
		// 출력
		for (Ex07 k : set1) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.print(k.getRank() + "\n");
		}
	}
}
