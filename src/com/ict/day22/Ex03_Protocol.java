package com.ict.day22;

import java.awt.Color;
import java.io.Serializable;

public class Ex03_Protocol implements Serializable{
	// cmd : 0 → 종료 (접속해제)
	// cmd : 1 → 채팅
	// cmd : 2 → 그림 그리기
	
	private int cmd;
	private String msg;
	
	private int x, y, wh;
	private Color color;
	
	// getter setter
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWh() {
		return wh;
	}
	public void setWh(int wh) {
		this.wh = wh;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
