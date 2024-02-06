package com.ict.day14;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : 예외 처리와 상관없이 반드시 실행해야 되는 문장을 처리할 때 사용
//			 주로 데이터베이스, 입/출력, 네트워크에서 사용 (보통 닫을 때 사용)
// 형식 : try{
// 			예외 발생 가능한 문장들;
// 			예외 발생 가능한 문장들;
// 			예외 발생 가능한 문장들;
// 		}catch(예외 객체 e){
// 			예외 발생 시 처리하는 문장;
// 		}catch(예외 객체 e){
// 			예외 발생 시 처리하는 문장;
// 		}finally{
//			반드시 실행해야 되는 문장;
//		}
public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			int su1 = 25;
			System.out.print("정수 입력 : ");
			int su2 = scan.nextInt();
			System.out.println("정답 : " + (su1 / su2));
		} catch (InputMismatchException e) {
			System.out.println("문자가 입력 되었습니다.");
			scan.nextLine();
			return;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			scan.nextLine();
			return;
		} finally { // return이 있어도 실행
			scan.close();
			System.out.println("반드시 실행 되는 문장");
		}
		System.out.println("수고하셨습니다.");
	}
}
