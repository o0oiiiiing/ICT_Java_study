package com.ict.day09;

public class Ex16 {
	public static void main(String[] args) {
		Ex15 t = new Ex15();
		
		String name = t.play01("둘리");
		System.out.println(t.play01("둘리")); // void는 return값이 없으므로 이렇게 출력이 안된다.
		System.out.println("name : " + name);
		System.out.println(t.name);
		
		int res = t.play02(90, 90, 90);
		System.out.println("res : " + res);
		System.out.println(t.sum);
		
		int res2 = t.play03(80, 80, 80);
		System.out.println("res2 : " + res2);
		System.out.println(t.sum);
	}
}
