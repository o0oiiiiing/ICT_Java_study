package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체 테이블 보고
		List<VO> list = DAO.getList();
		prn(list);

		System.out.println("선택하세요.");
		System.out.println("1. members 테이블 특정 데이터 보기");
		System.out.println("2. members 테이블 데이터 삽입");
		System.out.println("3. members 테이블 데이터 삭제");
		System.out.println("4. members 테이블 데이터 수정");
		System.out.println("5. members 테이블 아이디 로그인");		
		System.out.println(">> ");
		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			System.out.print("검색할 idx : ");
			String idx = scan.next();
			
			VO vo = DAO.getOne(idx); // 한 행만 나오면 VO, 여러개 나오면 List<VO>
			prn(vo);
			break;
		case 2:
			System.out.print("idx : ");
			String idx2 = scan.next();
			System.out.print("id : ");
			String id = scan.next();
			System.out.print("pw : ");
			String pw = scan.next();
			System.out.print("username : ");
			String username = scan.next();
			System.out.print("age : ");
			String age = scan.next();

			// 날짜는 오늘 날짜로
			VO vo2 = new VO();
			vo2.setIdx(idx2);
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setUsername(username);
			vo2.setAge(age);
			int res = DAO.getIns(vo2);
			
			if (res > 0) {
				System.out.println("삽입 성공");
				List<VO> list2 = DAO.getList();
				prn(list2);
			} else {
				System.out.println("삽입 실패");
			}

			break;
		case 3:
			System.out.println("삭제할 idx : ");
			String idx3 = scan.next();
			
			VO vo3 = new VO();
			vo3.setIdx(idx3);
			int result2 = DAO.getDel(vo3);
			
			if (result2 > 0) {
				System.out.println("삭제 성공");
				List<VO> list2 = DAO.getList();
				prn(list2);
			} else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.print("수정할 idx : ");
			String idx4 = scan.next();
			System.out.print("username : ");
			String username2 = scan.next();
			System.out.print("age : ");
			String age2 = scan.next();
			
			VO vo4 = new VO();
			vo4.setUsername(username2);
			vo4.setAge(age2);
			vo4.setIdx(idx4);
			
			int result3 = DAO.getUp(vo4);
			if (result3 > 0) {
				System.out.println("수정 성공");
				List<VO> list4 = DAO.getList();
				prn(list4);
			} else {
				System.out.println("수정 실패");
			}
			break;
		case 5:
			System.out.print("id : ");
			String idx5 = scan.next();
			System.out.print("pw : ");
			String pw3 = scan.next();
			
			VO vo5 = new VO();
			vo5.setId(idx5);
			vo5.setPw(pw3);
			
			VO vo6 = DAO.getLogin(vo5);
			if (vo6 != null) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			break;
		}
	}

	// customer 테이블 전체 보기
	public static void prn(List<VO> list) {
		System.out.println("idx\tid\tpw\tusername\tage\tregdate");
		for (VO k : list) {
			System.out.print(k.getIdx() + "\t");
			System.out.print(k.getId() + "\t");
			System.out.print(k.getPw() + "\t");
			System.out.print(k.getUsername() + "\t\t");
			System.out.print(k.getAge() + "\t");
			System.out.print(k.getRegdate() + "\n");
		}
	}

	public static void prn(VO vo) {
		System.out.println("idx\tid\tpw\tusername\tage\tregdate");
		System.out.print(vo.getIdx() + "\t");
		System.out.print(vo.getId() + "\t");
		System.out.print(vo.getPw() + "\t");
		System.out.print(vo.getUsername() + "\t\t");
		System.out.print(vo.getAge() + "\t");
		System.out.print(vo.getRegdate() + "\n");
	}
}
