package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("데이터 입력 : ");
			String msg = scan.nextLine();
			
			// 서버에 접속
			socket = new Socket("192.168.0.146", 7000);
			
			// 출력스트림 얻고 문자열 보내기
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			// bw.write("안녕하세요..^^");
			bw.write(msg + "\n"); // 줄바뀌는거 알게하려면 \n을 넣어야한다
			bw.flush();
			
			// 입력스트림 얻고 서버에서 보내 정보 받기
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String return_msg = br.readLine();
			System.out.println("받은 정보 : " + return_msg);
			
		} catch (Exception e) {
			System.out.println("클라이언트 오류");
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
				socket.close();
			} catch (Exception e2) {
			}
		}
	}
}
