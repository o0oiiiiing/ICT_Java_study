package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// OutputStreamWriter : 바이트 스트림을 문자 스트림으로 변경 (출력)
// OutputStream -> OutputStreamWriter -> BufferedWriter

// InputStreamReader : 바이트 스트림을 문자 스트림으로 변경 (입력)
// InputStream -> InputStreamReader => BuggeredReader

public class Ex08 {
	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("원하는 문자 : ");
		 * String msg = scan.next();
		 * 
		 * System.out.println("메세지 : " + msg);
		 */

		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// System.out.print("원하는 문자 : ")
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자 : ");
			bw.flush();
			
			// String msg = scan.next();
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			// System.out.println("메세지 : " + msg)
			bw.write("메세지 : " + msg);
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				osw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}
