package com.ict.day13;

enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex13 {
	String name;
	int size;
	Type type;
	public static void main(String[] args) {
		Ex13 shoes = new Ex13();
		shoes.name = "나이키";
		shoes.size = 240;
		shoes.type = Type.RUNNING;
		
		System.out.println("이름 : " + shoes.name);
		System.out.println("사이즈 : " + shoes.size);
		System.out.println("종류 : " + shoes.type);
	}
}
