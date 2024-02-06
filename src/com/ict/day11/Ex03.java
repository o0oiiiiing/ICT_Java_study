package com.ict.day11;

public class Ex03 {
	private boolean live;
	private int age;
	private String name;

	public Ex03() {
		live = true;
		age = 3;
		name = "큰뿔소";
	}

	// getter setter
	// boolean형은 isLive로 가져온다 getX
	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
