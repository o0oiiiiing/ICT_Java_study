package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// jar : 자바로 압축한 파일이다. 보통 라이브러리에 사용, 클래스들로 이루어져 있다.
// 1. 자바와 오라클을 연결해 주는 드라이버(ojdbcXXX.jar)가 필요하다.
//    드라이버는 sqldeveloper에 존재한다. 해당 드라이버를 util 폴더에 넣자.
// 2. 이클립스에서 프로젝트에서 마우스 오른쪽 
//    build path -> configure build path

public class Ex01 {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문을 작성
		Statement stmt = null;
		// 3-1. 결과를 받는 클래스 (select일 때)
		ResultSet rs = null;
		// 3-2. 결과를 받는 변수 (select가 아닐 때)
		int result = 0;
		
		// DB할 때는 try catch를 해야 한다.
		try {
			// 4. jdbc 드라이버 로딩 : Oracle, MySQL, mariaDB 다 다르다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// oracle.jdbc.driver (패키지)
			// OracleDriver (클래스)
			
			// 5. 오라클과 연결 하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##oing";
			String password = "1114";
			
			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. sql 작성
			// String sql = "select * from customer";
			String sql = "select * from customer where custid = 3";
			
			// 8. sql를 보내기 위해서 구문을 만듬
			stmt = conn.createStatement();
			
			// 9. 보내서 결과 받기
			// 9-1. select 문인 경우 
			rs = stmt.executeQuery(sql);
			
			// 9-2. insert, update, delete인 경우
			// result = stmt.executeUpdate(sql);
			// rs.getXXXX(index => 1부터)
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			
		} catch (Exception e) {
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
