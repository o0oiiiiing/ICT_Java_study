package com.ict.day21;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex07_Server {
	ArrayList<ServerClients> list = null;
	ServerSocket ss = null;
	
	public Ex07_Server() {
		list = new ArrayList<ServerClients>();
		try {
			ss = new ServerSocket(7007);
			System.out.println("서버 시작");
			play();
		} catch (Exception e) {
		}
	}
	
	public void play() {
		while (true) {
			try {
				// 접속자가 올 때까지 기다린다.
				Socket s = ss.accept();
				// 접속자 정보를 가진 소켓이 인자.
				// list를 활용한 sendMsg()와 removeClient()를
				// 사용하기 위해서 this를 인자로 보낸다.
				ServerClients clients = new ServerClients(s, this);
				new Thread(clients).start();
				list.add(clients);
				
				String msg = "**" + clients.ip + "님 입장";
				msg += System.lineSeparator();
				sendMsg(msg);
			} catch (Exception e) {
			}
		}
	}
	// 모든 사람에게 메세지 전달
	public void sendMsg(String msg) {
		// 모든 사람은 리스트 안에 존재
		for (ServerClients k : list) {
			k.out.println(msg);
		}
	}
	
	// 인자로 들어온 객체를 리스트에서 삭제
	public void removeClient(ServerClients sc) {
		list.remove(sc);
	}
	
	public static void main(String[] args) {
		new Ex07_Server();
	}
}
