package com.ict.day10;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Ex07 coffee = new Ex07();
		coffee.name = "커피음료";
		coffee.price = 1500;

		Ex07 ion = new Ex07();
		ion.name = "이온음료";
		ion.price = 2300;

		Ex07 cola = new Ex07();
		cola.name = "콜라";
		cola.price = 2000;

		Ex07 juice = new Ex07();
		juice.name = "과일음료";
		juice.price = 1800;

		// Ex07을 만든 객체 배열에 넣자.
		Ex07[] arr = { coffee, ion, cola, juice };

		Scanner scan = new Scanner(System.in);

		System.out.print("금액을 투입하세요.");
		int input = scan.nextInt();

		if (input < 1500) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈 : " + input + "원");
		} else {
			System.out.println("커피\t이온\t탄산\t과일");

			// 각 음료수의 가격을 가져와서 비교하자
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].price <= input) {
					System.out.print("O\t");
				} else {
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.print("선택하세요 >> ");
			String drink = scan.next();
			int output = 0;
			switch (drink) {
			case "커피":
				output = input - arr[0].price;
				break;
			case "이온":
				output = input - arr[1].price;
				break;
			case "탄산":
				output = input - arr[2].price;
				break;
			case "과일":
				output = input - arr[3].price;
				break;
			}
			System.out.println("잔돈 : " + output + "원");
		} //

	}
}
