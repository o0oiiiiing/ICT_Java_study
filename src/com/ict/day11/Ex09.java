package com.ict.day11;

public class Ex09 {
	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	
	// 생성자들
	// 생성자가 여러개 있으면 생성자 오버로딩이다.
	// 생성자가 다른 생성자를 호출할 수 있다.
	public Ex09() {
		System.out.println("기본 생성자 사용");
		name = "호돌이";
		addr = "LA";
	}

	public Ex09(String name) {
		this.name = name;
	}

	public Ex09(String name, int age) {
		// 생성자가 다른 생성자를 호출할 때는
		// 생성자 맨 첫 줄에 this([인자])를 사용한다.
		this(); // 무조건 첫 번째 줄에 아니면 오류
		this.name = name;
		this.age = age;
	}

	public Ex09(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
