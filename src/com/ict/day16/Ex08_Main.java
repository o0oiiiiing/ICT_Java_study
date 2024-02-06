package com.ict.day16;

public class Ex08_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex08_TestA testA = new Ex08_TestA();
		Ex08_TestB testB = new Ex08_TestB();
		Ex08_TestC testC = new Ex08_TestC();
		
		testA.start();
		testB.start();
		testC.start();
		
		System.out.println("수고하셨습니다.");
		
		// Thread를 상속받은 클래스에 일꾼 뿌리고 온다.
		// 뿌리고 온 다음에 메인은 다시 자기 일을 한다.
		// 메인의 일이 먼저 끝남.
		// Thread를 상속받은 클래스의 일은 메인이 끝나도 자기 일이 끝날 때까지 계속된다.
	
	}
}
