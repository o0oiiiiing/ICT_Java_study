package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// FileInputStream → 1byte, read() → 아스키코드(숫자)(숫자, 대/소문자), read(byte[] b) → String 이용
// FileReader → 2 byte, read() → 유니코드(숫자)(전세계 문자 표현 가능), read(char[] c) → String 이용
public class Ex05 {
	public static void main(String[] args) {
		String pathname = "D:/oing/util/test05.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			// 한 글자 읽기 (숫자 → 형변환)
			// int k = fr.read();
			// System.out.println(k + ":" + (char)k);
			
			// 전체 읽기
			// int k = 0;
			// while ((k = fr.read()) != -1) {
			// 	System.out.println(k + ":" + (char)k);
			// }
			
			// 배열 처리
			char[] c = new char[(int) file.length()];
			fr.read(c);
			// for (char k : c) {
			// 	System.out.print(k);
			// }
			// trim() : 앞 뒤 공백 삭제 어제도 9시에 뻗었는데
			String msg = new String(c).trim();
			System.out.println(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
