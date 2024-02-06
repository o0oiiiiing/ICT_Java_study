package com.ict.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DataInputStream과 DataOutputStream
// 기본 자료형의 데이터를 주고 받을 때 사용
// **반드시 입력순서와 출력순서를 맞춰야 한다.
// 기본 생성자가 없어서 BufferedStream처럼 FileStream을 이용하자
// DataInputStream를 사용해야 읽을 수 있다.
public class Ex01 {
	public static void main(String[] args) {
		String pathname = "D:/oing/util/test03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			// 출력
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			// writeXXXX() , XXXX → 기본자료형
			dos.writeChar(97);
			dos.writeChar('D');
			dos.writeBoolean(true);
			dos.writeDouble(178.95);
			dos.writeInt(84);
			dos.writeChar('가');
			dos.flush();
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// readXXXX(), XXXX → 기본자료형
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
