package com.ict.day18;

// VO(ValueObject), DTO(Data Transform Object)
public class Ex08 {
	private String name;
	private int age;
	
	// 생성자
	public Ex08() {
	}

	public Ex08(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	
}
