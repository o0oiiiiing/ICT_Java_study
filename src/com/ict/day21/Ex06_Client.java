package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


// 만들다 말았음~~
public class Ex06_Client implements Runnable {
	Socket socket;

	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;

	InputStreamReader isr = null;
	BufferedReader br = null;

	public Ex06_Client() {
		try {
			// 소켓으로 서버에 접속
			socket = new Socket("192.168.0.20", 7001);
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			
			new Thread(this).start();
			
			while (true) {
				System.out.print("데이터 입력 : ");
				keyboard = new BufferedReader(new InputStreamReader(System.in));
				String msg = keyboard.readLine();
				
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				bw.write(msg + System.lineSeparator());
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				String msg = br.readLine();
				System.out.println("서버로 부터 받은 메세지 : " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Ex06_Client();
	}

}
