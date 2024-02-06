package com.ict.day16;

// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
// 일반 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
public class Ex10_Main {
	public static void main(String[] args) {
		// 둘 다 데몬을 실행하는 경우에는 정상적으로 작동하지만
		// 하나만 실행하는 경우에는 둘 다 데몬이 실행되지 않는다.
		// 이유를 찾아보자.
		
		Ex10 test = new Ex10();
		Thread thread = new Thread(test);
		thread.setDaemon(true);
		thread.start();
		
		Ex11 test2 = new Ex11();
		Thread thread2 = new Thread(test2);
		// thread2.setDaemon(true);
		thread2.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("수고하셨습니다.");
	}
}
