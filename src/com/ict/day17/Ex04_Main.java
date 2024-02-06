package com.ict.day17;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04 test = new Ex04();
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
	}
}
