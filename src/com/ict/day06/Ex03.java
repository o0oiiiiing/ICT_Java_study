package com.ict.day06;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 for문에서 break와 continue
		
		
		// break
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();
		
		
		// continue
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==2) continue;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();
		
		
	}
}
