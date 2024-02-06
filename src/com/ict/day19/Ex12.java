package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// D:/oing/util/image01.png 파일을 D:/oing/image01.png로 복사하자
public class Ex12 {
	public static void main(String[] args) {
		String inputpath =  "D:/oing/util/image01.png";
		String outputpath =  "D:/oing/image02.png";
		
		File in_file = new File(inputpath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		File out_file = new File(outputpath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
				bos.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 원본 삭제하면 이동
			// close로 파일을 닫아주고 실행해야 한다.
			boolean s = in_file.delete();
			if (s) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}
		
	}
}
