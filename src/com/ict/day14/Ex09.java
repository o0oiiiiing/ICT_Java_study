package com.ict.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch : 예외가 하나가 아니라 여러가지가 발생할 경우 사용
// 주의사항 : 상위 클래스 Exception은 반드시 가장 아래쪽 catch문에 사용해야 된다.
// 형식 : try{
//			예외 발생 가능한 문장들;
//			예외 발생 가능한 문장들;
//			예외 발생 가능한 문장들;
//		}catch(예외 객체 e){
//			예외 발생 시 처리하는 문장;
//		}catch(예외 객체 e){
//			예외 발생 시 처리하는 문장;
//		}
public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				int su1 = 25;
				System.out.print("정수 입력 : ");
				int su2 = scan.nextInt();
				System.out.println("정답 : " + (su1 / su2));
			} catch (InputMismatchException e) {
				System.out.println("문자가 입력 되었습니다.");
				scan.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다.");
				scan.nextLine();
			}
		}
		// System.out.println("수고하셨습니다.");
	}
}
