package com.ict.day17;

public class Ex01 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 51; i++) {
			System.out.println("run : " + Thread.currentThread().getName());
		}
		// 메서드가 메서드를 호출
		play();
		System.out.println("run : " + Thread.currentThread().getName());
	}
	
	public void play() {		
		System.out.println("first : " + Thread.currentThread().getName());
	}
}
