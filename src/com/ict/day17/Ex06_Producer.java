package com.ict.day17;

public class Ex06_Producer implements Runnable {

	private Ex06_Car car;

	public Ex06_Producer(Ex06_Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
