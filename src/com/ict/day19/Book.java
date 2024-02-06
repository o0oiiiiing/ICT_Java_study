package com.ict.day19;

class Book {
	private String name;
	private int price;
	
	// 생성자
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
