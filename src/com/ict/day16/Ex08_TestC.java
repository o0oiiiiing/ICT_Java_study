package com.ict.day16;

public class Ex08_TestC extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("111 : " + i + Thread.currentThread().getName());
		}
	}
}
