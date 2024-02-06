package com.ict.day17;

public class Ex07_Main {
	public static void main(String[] args) {
		Ex07_ATM atm = new Ex07_ATM();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
	}
}
