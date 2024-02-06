package com.ict.day04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		int menu = 0;
		int input = 0;
		int su = 0;
		int dan = 0;
		int total = 0;
		int vat = 0;
		int output = 0;
		String drink = "";
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println(">>>>>>>>>>> 메뉴 >>>>>>>>>>>");
        System.out.println(">>>   1.카페모카(3500)    >>>");
        System.out.println(">>>   2.카페라떼(4000)    >>>");
        System.out.println(">>>   3.아메리카노(3000)   >>>");
        System.out.println(">>>   4.과일쥬스(4000)    >>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        System.out.print("메뉴를 선택하세요  >>> ");
        menu = scan.nextInt();
        
        System.out.print("주문 수량 >>> ");
        su = scan.nextInt();
        
        System.out.print("입금할 금액 >>> ");
        input = scan.nextInt();
        
        if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			drink = "과일주스";
			dan = 3500;
		}
        
        // 단가 + 수량
        total = dan * su;
		vat = (int)(total*0.1);
		output = input - (total+vat);
        
        System.out.println("잔돈은 " + output +"원 입니다.");
        
	}
}
