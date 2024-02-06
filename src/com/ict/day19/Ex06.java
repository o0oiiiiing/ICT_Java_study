package com.ict.day19;

import java.io.File;

/*
File 클래스 : 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
- 주요 생성자 : File(String 경로),
			 File(String 상위경로,String 하위경로), File(File 상위경로, String 하위경로)
- 주요 메서드 : creatNewFile() : 파일 생성
			 mkdir(), mkdirs() : 디렉토리 생성
			 mkdir은 만들고자 하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우, 생성불가
			 mkdirs는 만들고자 하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우, 상위 디렉토리까지 생성
			 delete() : 삭제
			 isFile() : 파일이면 true
			 isDirectory() : 디렉토리면 true
			 exists() : 존재하면 true
			 getName() : 이름 반환
			 length() : 파일의 크기를 byte로 변환 (디렉토리는 크기가 없음)
			 list() : 특정 위치의 내용을 String 배열로 만들어서 저장
			 getAbsolutePath() : 절대주소
			 getPath() : 상대주소
 */
public class Ex06 {
	public static void main(String[] args) {
		// 본인 환경에 맞게 경로 설정
		// String pathname = "D:\\oing\\javastudy";
		String pathname = "D:\\oing\\javastudy";
		File file = new File(pathname);

		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname, k);
			// System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("디렉토리 : " + k);
			} else {
				// Byte -> KB -> MB -> GB -> TB -> PB
				// 각각 1024배
				System.out.println("파일 : " + k + ", " + k.length() + "Byte");
				System.out.println("파일 : " + k + ", " + (int) Math.ceil(k.length() * 1.0 / 1024) + "KB");
			}
		}
	}
}
