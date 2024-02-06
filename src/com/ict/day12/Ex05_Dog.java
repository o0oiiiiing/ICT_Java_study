package com.ict.day12;

public class Ex05_Dog extends Ex05_Animal{
	int tail = 3;
	
	@Override
	public void sound() {
		System.out.println("멍! 멍! 🐶");
	}
	
	public void hobby() {
		System.out.println("수영하기");
	}
}
