package com.ict.day13;

interface Ex06_Add {
	public double plus(double s1, double s2);
}

interface Ex07_Sub {
	public double minus(double s1, double s2);
}

abstract class Ex08_Oper {
	public abstract double mul(double s1, double s2);
	public abstract double div(double s1, double s2);
}

// 위에 인터페이스와 추상 클래스 상속 받자
class Ex09_Calc extends Ex08_Oper implements Ex06_Add, Ex07_Sub{

	@Override
	public double minus(double s1, double s2) {
		return s1 -s2;
	}

	@Override
	public double plus(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1 + s2;
	}
	
	@Override
	public double mul(double s1, double s2) {
		return s1 * s2;
	}

	@Override
	public double div(double s1, double s2) {
		return s1 / s2;
	}

	
}