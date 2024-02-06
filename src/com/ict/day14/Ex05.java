package com.ict.day14;

// 추상클래스
abstract public class Ex05 {
	int data = 1000;

	public abstract void printData();
}

class Ex05_Test extends Ex05 {

	@Override
	public void printData() {
		System.out.println("data1 : " + (data + 100));
	}

}

class Ex05_Test2 {
	// 상속받지 않고 바로 객체 생성
	Ex05 ex05 = new Ex05() {

		@Override
		public void printData() {
			System.out.println("data2 : " + (data + 100));
		}
	};
}

class Ex05_Test3 {
	// 상속받지 않고 바로 객체 생성
	public void prn() {
		Ex05 ex05 = new Ex05() {
			@Override
			public void printData() {
				System.out.println("data3 : " + (data + 100));
			}
		}; // 클래스
		ex05.printData();
	} // 메서드
}

class Ex05_Test4 {
	// 상속받지 않고 바로 객체 생성
	public void prn() {
		new Ex05() {
			@Override
			public void printData() {
				System.out.println("data4 : " + (data + 100));
			}
		}.printData(); // 클래스
	} // 메서드
}