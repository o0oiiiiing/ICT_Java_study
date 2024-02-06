package com.ict.day11;

public class Ex15 {
	// static 초기화
	/*
		static {
		초기화 내용;
		}
	 */
	
	int s1 = 100;
	private int p1 = 300;
	static int s2;
	static int s3;
	
	public static int k2 = 300;
	static int k3 = 300;
	private static int k4 = 500;
	
	// 이 위에 있는 수들은 이 수로 초기화됨
	static {
		s2 = 50000;
		k2 = 20000;
		m2 = 60000;
		j2 = 40000;
	}
	// 이 아래부터는 지정하면 다시 그 수로 변함
	
	static int m2;			// 60000
	static int j2 = 400;	// 400
	
}
