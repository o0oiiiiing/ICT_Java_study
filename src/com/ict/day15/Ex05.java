package com.ict.day15;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			int su = (int)(Math.random()*10);
			arr[i] = su;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "  ");
		}
		System.out.println();
	}
}
