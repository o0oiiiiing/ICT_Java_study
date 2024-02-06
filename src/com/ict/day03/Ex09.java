package com.ict.day03;

public class Ex09 {
	public static void main(String[] args) {
		// 카페모카 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가?(단, 부가세 10% 포함)
		
		String coff = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		
		int total = dan * su;
		int vat = total / 10;
		int vat2 = (int)(total*0.1);
		
		int sum = total + vat;
		
		// 다른 방법
		int sum2 = (int)(total * 1.1);
		int output = input - sum;
		
		System.out.println(vat);
		System.out.println(vat2);
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println("잔돈 : " + output);
		
		
	}
}
