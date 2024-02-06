package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		// customer의 이강인 삭제하기
		// 오라클에 접속을 위한 초기값들
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##oing";
			String password = "1114";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from customer where name = '이강인'";
			
			stmt = conn.createStatement(); // delete에 사용
			
			result = stmt.executeUpdate(sql);
			
			if (result>0) {
				System.out.println("삭제 성공");
				sql = "select * from customer";
				stmt = conn.createStatement(); // select에 사용
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("삭제 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
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
