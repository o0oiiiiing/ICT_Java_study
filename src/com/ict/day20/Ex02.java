package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// PrintStream은 모든 데이터를 출력할 수 있다. (입력없음)
//기본 생성자가 없어서 BufferedStream처럼 FileStream을 이용하자
public class Ex02 {
	public static void main(String[] args) {
		String pathname = "D:/oing/util/test04.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream(file);
			ps = new PrintStream(fos);
			
			// System.out.println (기본자료형 또는 String) 와 같음
			// System.out 은 모니터에 출력
			// ps는 (ps -> fos -> file) 파일에 출력
			ps.println('A');
			ps.println(false);
			ps.println(3.14);
			ps.println("Hello World");
			ps.println(92);
			ps.println("메뚜기 월드에 오신 것을 환영합니다 🪩🦗🪩");
			ps.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
