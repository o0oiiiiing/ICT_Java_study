package com.ict.day16;

// 스레드 만들어서 처리하려면
public class Ex08_TestA extends Thread {

	// 이렇게 하면 run()이 아니라 start()를 찾아가므로 main이 일한다.
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : " + i + Thread.currentThread().getName());
//		}
//	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + i + Thread.currentThread().getName());
		}
	}
}
