package com.ict.day20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInputStream : 객체 입력 스트림
// readObject() : 객체 역직렬화 메서드
public class Ex09_Input {
	public static void main(String[] args) {
		String pathname = "D:/oing/util/object01.txt";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			// 1. 하나일 때 역직렬화 (원래대로 되돌린다.)
//			Ex09_VO vo = (Ex09_VO) ois.readObject();
//			// 화면에 출력
//			System.out.println("이름\t나이\t몸무게\t성별");
//			System.out.print(vo.getName() + "\t");
//			System.out.print(vo.getAge() + "\t");
//			System.out.print(vo.getWeight() + "\t");
//			if (vo.isGender()) {
//				System.out.println("남성"); 
//			} else {
//				System.out.println("여성");
//			}
			
			// 2. 여러개일 때 역직렬화
			ArrayList<Ex09_VO> list = (ArrayList<Ex09_VO>) ois.readObject();
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex09_VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.print(k.getWeight() + "\t");
				if (k.isGender()) {
					System.out.println("남성"); 
				} else {
					System.out.println("여성");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
