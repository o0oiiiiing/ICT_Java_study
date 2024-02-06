package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex05_Server {
	public static void main(String[] args) {
		
		ServerSocket server = null; // 서버 소켓
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			server = new ServerSocket(7000); // 서버 포트 번호 7000
			System.out.println("서버 대기중...");
			
			// 클라이언트가 요청하기 전까지는 블록킹 된다.
			socket = server.accept();
			
			// 클라이언트가 보낸 정보를 받기 위해 입력 스트림을 얻기
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			// 서버에 접속한 ip 주소 열기
			String ip = socket.getInetAddress().getHostAddress();
			String msg = br.readLine();
			
			// 들어온 문자 출력하기
			System.out.println(ip + " : " + msg);
			
			// 클라이언트에게 보낼 출력 스트림 열기
			// socket이 정보를 가지고 있다.
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg);
			bw.flush();
			
		} catch (IOException e) {
			System.out.println("서버 오류");
		} finally {
			try {
				os.close();
				osw.close();
				bw.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
