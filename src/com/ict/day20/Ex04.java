package com.ict.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// BufferedWriter : newLine() (줄 바꿈)
public class Ex04 {
	public static void main(String[] args) {
		String pathname = "D:/oing/util/test06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			// String str = "안녕하세요.\n12345\nHello\n";
			// fw.write(str);
			// fw.flush();
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("123456");
			bw.newLine();
			bw.write("Hello");
			bw.newLine();
			bw.write("大韓");
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
