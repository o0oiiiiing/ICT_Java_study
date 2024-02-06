package com.ict.day16;

public class Ex08_TestB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("가가가 : " + i + Thread.currentThread().getName());
		}
	}
}
