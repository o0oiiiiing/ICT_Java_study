package com.ict.day14;

interface Ex06 {
	int DATA = 1000;
	public void printData();
}

class Ex06_Test implements Ex06{
	@Override
	public void printData() {
		int data1 = DATA + 100;
		System.out.println("data1 : " + data1);
	}
}

class Ex06_Test2{
	public void prn() {
		new Ex06() {
			int data2 = DATA + 100;
			@Override
			public void printData() {
				System.out.println("data2 : " + data2);
			}
		}.printData();
	}
}