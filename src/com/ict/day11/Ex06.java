package com.ict.day11;

public class Ex06 {
	private String name = "";
	private int price = 0;

	public Ex06(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// setter
	public void sName(String k) {
		name = k;
	}

	public void sPrice(int k) {
		price = k;
	}

	// getter
	public String gName() {
		return name;
	}

	public int gPrice() {
		return price;
	}

}
