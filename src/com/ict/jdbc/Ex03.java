package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// customer 테이블에 6, 이강인, 대한민국 제주도, 000-1234-9876을 삽입하자.
		
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문을 작성
		Statement stmt = null;
		// 3-1. 결과를 받는 클래스 (select일 때)
		ResultSet rs = null;
		// 3-2. 결과를 받는 변수 (select가 아닐 때)
		int result = 0;
		
		try {
			// 4. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 오라클과 연결하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##oing";
			String password = "1114";
			
			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. sql
			String sql = "insert into customer(custid, name, address , phone) "
					+ "values(6, '이강인', '대한민국 제주도', '000-1234-9876')";
			
			// 8. sql를 보내기 위해서 구문을 만듬
			stmt = conn.createStatement();
			
			// 9. 보내서 결과 받기
			result = stmt.executeUpdate(sql);
			// 삽입 성공하면 result = 1이다. (1행 삽입)
			if (result > 0) {
				System.out.println("삽입 성공");
				// 성공했을 때 select 문을 이용해서 삽입된 내용을 보자
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("삽입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
