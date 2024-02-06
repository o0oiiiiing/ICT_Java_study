package com.ict.day13;

public class Ex11_Sport {
	String addr = "서울";
	int count = 11;
	
	public void addr(String str) {
		addr = str;
	}
	
	public void count (int su) {
		
	}
}

class Ex11_Soccer extends Ex11_Sport implements Ex11_IBehavior{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}