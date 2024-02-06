package com.ict.day20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// FileOutputStream → 1byte, write(int c), write(byte[] b)
// FileWriter → 2byte 처리, write(int c), write(char[] c), write(String str)
public class Ex03 {
	public static void main(String[] args) {
		String pathname = "D:/oing/util/test05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			String str = "안녕하세요.\n12345\nHello\n";
			fw.write(str);
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
